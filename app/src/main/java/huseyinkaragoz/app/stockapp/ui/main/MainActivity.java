package huseyinkaragoz.app.stockapp.ui.main;

import android.os.Bundle;

import dagger.Provides;
import dagger.Subcomponent;
import huseyinkaragoz.app.stockapp.R;
import huseyinkaragoz.app.stockapp.ui.BaseActivity;

/**
 * Created by huseyinkaragozz on 12.11.2017.
 */
@Subcomponent
public class MainActivity extends BaseActivity {


    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}