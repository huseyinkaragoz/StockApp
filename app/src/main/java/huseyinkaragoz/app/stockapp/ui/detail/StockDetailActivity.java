package huseyinkaragoz.app.stockapp.ui.detail;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.annotation.Nullable;

import huseyinkaragoz.app.stockapp.R;
import huseyinkaragoz.app.stockapp.ui.BaseActivity;

/**
 * Created by huseyinkaragozz on 12.11.2017.
 */

public class StockDetailActivity extends BaseActivity implements LifecycleOwner {
    @Override
    public int getLayoutRes() {
        return R.layout.detail_activity;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}