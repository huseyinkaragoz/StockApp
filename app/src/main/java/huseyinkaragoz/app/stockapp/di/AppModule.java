package huseyinkaragoz.app.stockapp.di;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.res.Resources;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import huseyinkaragoz.app.stockapp.R;
import huseyinkaragoz.app.stockapp.StockApplication;
import huseyinkaragoz.app.stockapp.data.local.StockDatabase;
import huseyinkaragoz.app.stockapp.data.local.dao.StockDao;
import huseyinkaragoz.app.stockapp.data.remote.ApiConstants;
import huseyinkaragoz.app.stockapp.data.remote.RequestInterceptor;
import huseyinkaragoz.app.stockapp.data.remote.StockDBService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by huseyinkaragozz on 28.10.2017
 */

@Module(includes = ViewModelModule.class)
public class AppModule {


    @Provides
    @Singleton
    OkHttpClient provideHttpClient() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.connectTimeout(ApiConstants.TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        okHttpClient.readTimeout(ApiConstants.TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        okHttpClient.addInterceptor(new RequestInterceptor());
        return okHttpClient.build();
    }

    @Provides
    @Singleton
    StockDBService provideRetrofit(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit.create(StockDBService.class);
    }

    @Provides
    @Singleton
    StockDatabase provideStockDatabase(Application application) {
        return Room.databaseBuilder(application, StockDatabase.class, "Stocks.db").build();
    }

    @Provides
    @Singleton
    StockDao provideStockDao(StockDatabase stockDatabase) {
        return stockDatabase.stockDao();
    }

    @Provides
    @Singleton
    GoogleApiClient provideGoogleApiClient(GoogleApiClient googleApiClient, Application application) {
        googleApiClient = new GoogleApiClient.Builder(application).build();
        return googleApiClient;
    }

    @Provides
    @Singleton
    GoogleSignInOptions googleSignInOptions(GoogleSignInOptions gso) {
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(Resources.getSystem().getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        return gso;
    }

    FusedLocationProviderClient fusedLocationProviderClient(Context context) {
        FusedLocationProviderClient fLPC = LocationServices.getFusedLocationProviderClient(context);
        return fLPC;
    }



}
