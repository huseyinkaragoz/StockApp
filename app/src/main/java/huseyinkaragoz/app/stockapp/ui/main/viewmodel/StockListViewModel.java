package huseyinkaragoz.app.stockapp.ui.main.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import huseyinkaragoz.app.stockapp.data.Resource;
import huseyinkaragoz.app.stockapp.data.StockRepository;
import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public class StockListViewModel extends ViewModel {

    private final LiveData<Resource<List<StockEntity>>> chosenCountryStocks;

    @Inject
    public StockListViewModel(StockRepository stockRepository) {
        chosenCountryStocks = stockRepository.loadChosenCountryStocks();
    }

    LiveData<Resource<List<StockEntity>>> getChosenCountryStocks() {
        return chosenCountryStocks;
    }

}
