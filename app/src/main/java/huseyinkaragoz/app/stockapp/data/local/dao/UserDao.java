package huseyinkaragoz.app.stockapp.data.local.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import huseyinkaragoz.app.stockapp.data.local.entity.User;

/**
 * Created by huseyinkaragozz on 20.11.2017.
 */

public interface UserDao {

    @Query("SELECT * FROM users")
    LiveData<User> loadUser();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void savedUsers(List<User> user);

    @Query("SELECT * FROM stocks ")
    LiveData<User> getUser();
}
