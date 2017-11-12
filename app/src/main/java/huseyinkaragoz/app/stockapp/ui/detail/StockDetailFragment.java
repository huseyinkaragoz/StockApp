package huseyinkaragoz.app.stockapp.ui.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import huseyinkaragoz.app.stockapp.ui.BaseFragment;
import huseyinkaragoz.app.stockapp.ui.detail.StockDetailViewModel;

/**
 * Created by huseyinkaragozz on 12.11.2017.
 */

public class StockDetailFragment extends BaseFragment {

    public static StockDetailFragment newInstance() {
        Bundle args = new Bundle();
        StockDetailFragment fragment = new StockDetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Class getViewModel() {
        return StockDetailViewModel.class;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return dataBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public int getLayoutRes() {
        return 0;
    }
}
