package huseyinkaragoz.app.stockapp.data;

import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import javax.inject.Inject;

import huseyinkaragoz.app.stockapp.data.local.dao.StockDao;
import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;
import huseyinkaragoz.app.stockapp.data.remote.StockDBService;
import huseyinkaragoz.app.stockapp.data.remote.model.StocksResponse;
import retrofit2.Call;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public class StockRepository {

    private final StockDao stockDao;
    private final StockDBService stockDBService;

    @Inject
    public StockRepository(StockDao stockDao, StockDBService stockDBService) {
        this.stockDao = stockDao;
        this.stockDBService = stockDBService;
    }

    public LiveData<Resource<List<StockEntity>>> loadChosenCountryStocks() {
        return new NetworkBoundResource<List<StockEntity>, StocksResponse>() {

            @Override
            protected void saveCallResult(@NonNull StocksResponse item) {
                stockDao.savedStocks(item.getResults());
            }

            @NonNull
            @Override
            protected LiveData<List<StockEntity>> loadFromDb() {
                return stockDao.loadStocks();
            }

            @NonNull
            @Override
            protected Call<StocksResponse> createCall() {
                return stockDBService.loadStocks();
            }
        }.getAsLiveData();
    }

    /*
    Burası düzeltilecek
     */
    public LiveData<StockEntity> getStock() {
        return stockDao.getStock();
    }

}
