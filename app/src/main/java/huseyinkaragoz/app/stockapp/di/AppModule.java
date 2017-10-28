package huseyinkaragoz.app.stockapp.di;

import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.arch.persistence.room.Room;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
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

@Module(includes = ViewModel.class)
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

}
