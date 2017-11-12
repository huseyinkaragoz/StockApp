package huseyinkaragoz.app.stockapp.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import huseyinkaragoz.app.stockapp.StockApplication;

/**
 * Created by huseyinkaragozz on 27.10.2017.
 */

@Singleton
@Component(modules = {AppModule.class,
        AndroidInjectionModule.class,
        ActivityBuilderModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(StockApplication stockApplication);


}
