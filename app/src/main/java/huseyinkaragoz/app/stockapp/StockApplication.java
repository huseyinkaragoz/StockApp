package huseyinkaragoz.app.stockapp;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import huseyinkaragoz.app.stockapp.di.AppComponent;

/**
 * Created by huseyinkaragozz on 25.10.2017.
 */

public class StockApplication extends Application implements HasActivityInjector {


    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        initializeComponent();
    }

    private void initializeComponent() {
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
