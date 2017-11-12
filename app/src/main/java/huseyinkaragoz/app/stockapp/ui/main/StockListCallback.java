package huseyinkaragoz.app.stockapp.ui.main;

import android.view.View;

import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public interface StockListCallback {

    void onStackClicked(StockEntity stockEntity, View sharedView);
}
