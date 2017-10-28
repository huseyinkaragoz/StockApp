package huseyinkaragoz.app.stockapp.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import huseyinkaragoz.app.stockapp.ui.main.fragment.StockListFragment;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

@Module
public abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract StockListFragment contributeStockListFragment();
}
