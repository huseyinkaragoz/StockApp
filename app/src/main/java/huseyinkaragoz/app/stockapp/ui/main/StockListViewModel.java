package huseyinkaragoz.app.stockapp.ui.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.location.Location;

import java.util.List;

import javax.inject.Inject;

import huseyinkaragoz.app.stockapp.data.Resource;
import huseyinkaragoz.app.stockapp.data.StockRepository;
import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;

/**
 * Created by huseyinkaragozz on 12.11.2017.
 */

public class StockListViewModel extends ViewModel {

    private final LiveData<Resource<List<StockEntity>>> chosenCountryStocks;
    private final LiveData<Location> location;


    @Inject
    public StockListViewModel(StockRepository stockRepository, LiveData<Location> location) {
        chosenCountryStocks = stockRepository.loadChosenCountryStocks();
        this.location = location;
    }

    LiveData<Resource<List<StockEntity>>> getChosenCountryStocks() {
        return chosenCountryStocks;
    }

    LiveData<Location> getLocation() {
        return location;
    }


}
