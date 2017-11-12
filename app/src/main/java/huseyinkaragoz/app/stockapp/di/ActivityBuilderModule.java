package huseyinkaragoz.app.stockapp.di;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import huseyinkaragoz.app.stockapp.ui.detail.StockDetailActivity;
import huseyinkaragoz.app.stockapp.ui.main.MainActivity;
import huseyinkaragoz.app.stockapp.ui.main.StockListFragment;

/**
 * Created by huseyinkaragozz on 27.10.2017.
 */
@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract StockDetailActivity stockDetailActivity();
}
