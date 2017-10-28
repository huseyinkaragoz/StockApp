package huseyinkaragoz.app.stockapp.data.local.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

@Dao
public interface StockDao {

    @Query("SELECT * FROM stocks")
    LiveData<List<StockEntity>> loadStocks();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void savedStocks(List<StockEntity> stockEntities);

    @Query("SELECT * FROM stocks ")
    LiveData<StockEntity> getStock();
}
