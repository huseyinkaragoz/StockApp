package huseyinkaragoz.app.stockapp.data.local.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

@Entity(tableName = "stocks")
public class StockEntity {

    @PrimaryKey
    @SerializedName("id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
