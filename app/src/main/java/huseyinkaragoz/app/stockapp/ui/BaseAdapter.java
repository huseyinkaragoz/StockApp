package huseyinkaragoz.app.stockapp.ui;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public abstract class BaseAdapter<Type extends RecyclerView.ViewHolder, Data> extends RecyclerView.Adapter<Type> {

    public abstract void setData(List<Data> data);
}
