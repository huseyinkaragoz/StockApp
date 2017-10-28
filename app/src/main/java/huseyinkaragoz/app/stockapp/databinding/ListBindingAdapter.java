package huseyinkaragoz.app.stockapp.databinding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import huseyinkaragoz.app.stockapp.data.Resource;
import huseyinkaragoz.app.stockapp.ui.BaseAdapter;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public final class ListBindingAdapter {

    @BindingAdapter(value = "resource")
    public static void setResource(RecyclerView recyclerView, Resource resource) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();

        if (adapter == null)
            return;

        if (resource == null || resource.data == null)
            return;

        if (adapter instanceof BaseAdapter) {
            ((BaseAdapter) adapter).setData((List) resource.data);
        }

    }
}
