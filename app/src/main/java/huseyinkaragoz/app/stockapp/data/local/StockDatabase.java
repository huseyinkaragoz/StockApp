package huseyinkaragoz.app.stockapp.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import huseyinkaragoz.app.stockapp.data.local.dao.StockDao;
import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

@Database(entities = {StockEntity.class}, version = 1)
public abstract class StockDatabase extends RoomDatabase {

    public abstract StockDao stockDao();

}
