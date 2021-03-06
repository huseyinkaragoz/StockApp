package huseyinkaragoz.app.stockapp.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dagger.Subcomponent;
import huseyinkaragoz.app.stockapp.data.local.entity.StockEntity;
import huseyinkaragoz.app.stockapp.ui.BaseFragment;

/**
 * Created by huseyinkaragozz on 12.11.2017.
 */
@Subcomponent
public class StockListFragment extends BaseFragment implements StockListCallback {

    public static StockListFragment newInstance() {
        Bundle args = new Bundle();
        StockListFragment fragment = new StockListFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onStackClicked(StockEntity stockEntity, View sharedView) {

    }

    @Override
    public Class getViewModel() {
        return StockListViewModel.class;
    }

    @Override
    public int getLayoutRes() {
        return 0;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        return dataBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
