package huseyinkaragoz.app.stockapp.data.local.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

/**
 * Created by huseyinkaragozz on 20.11.2017.
 */

@Entity(tableName = "users")
public class User {

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
