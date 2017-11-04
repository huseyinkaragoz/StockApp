package huseyinkaragoz.app.stockapp.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import huseyinkaragoz.app.stockapp.ui.detail.activity.StockDetailActivity;
import huseyinkaragoz.app.stockapp.ui.main.activity.MainActivity;
import huseyinkaragoz.app.stockapp.ui.main.fragment.StockListFragment;

/**
 * Created by huseyinkaragozz on 27.10.2017.
 */
@Module
public abstract class ActivityBuilderModule {


    @ContributesAndroidInjector(modules = ActivityBuilderModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector(modules = ActivityBuilderModule.class)
    abstract StockDetailActivity stockDetailActivity();

    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract StockListFragment stockListFragment();
}
