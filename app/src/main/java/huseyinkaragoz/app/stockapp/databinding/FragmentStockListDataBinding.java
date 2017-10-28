package huseyinkaragoz.app.stockapp.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.view.View;

/**
 * Created by huseyinkaragozz on 28.10.2017.
 */

public class FragmentStockListDataBinding extends ViewDataBinding {
    /**
     * @param bindingComponent
     * @param root
     * @param localFieldCount
     * @hide
     */
    protected FragmentStockListDataBinding(android.databinding.DataBindingComponent bindingComponent, View root, int localFieldCount) {
        super(bindingComponent, root, localFieldCount);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override
    public boolean setVariable(int variableId, Object value) {
        return false;
    }

    @Override
    protected void executeBindings() {

    }

    @Override
    public void invalidateAll() {

    }

    @Override
    public boolean hasPendingBindings() {
        return false;
    }
}
