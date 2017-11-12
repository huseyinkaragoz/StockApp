package huseyinkaragoz.app.stockapp.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import huseyinkaragoz.app.stockapp.ui.detail.StockDetailViewModel;
import huseyinkaragoz.app.stockapp.ui.main.StockListViewModel;
import huseyinkaragoz.app.stockapp.viewmodel.StockViewModelFactory;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */


@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(StockListViewModel.class)
    abstract ViewModel bindsStockListViewModel(StockListViewModel stockListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(StockDetailViewModel.class)
    abstract ViewModel bindsStockDetailViewModel(StockDetailViewModel stockDetailViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindsViewModelfactory(StockViewModelFactory stockViewModelFactory);

}
