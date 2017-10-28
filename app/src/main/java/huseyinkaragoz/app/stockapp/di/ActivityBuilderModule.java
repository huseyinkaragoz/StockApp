package huseyinkaragoz.app.stockapp.di;

import dagger.android.ContributesAndroidInjector;
import huseyinkaragoz.app.stockapp.ui.detail.activity.StockDetailActivity;
import huseyinkaragoz.app.stockapp.ui.main.activity.MainActivity;

/**
 * Created by huseyinkaragozz on 27.10.2017.
 */

public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract StockDetailActivity stockDetailActivity();
}
