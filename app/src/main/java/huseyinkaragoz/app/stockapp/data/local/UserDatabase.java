package huseyinkaragoz.app.stockapp.data.local;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import huseyinkaragoz.app.stockapp.data.local.dao.UserDao;
import huseyinkaragoz.app.stockapp.data.local.entity.User;

/**
 * Created by huseyinkaragozz on 20.11.2017.
 */
@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDao userDao();

}