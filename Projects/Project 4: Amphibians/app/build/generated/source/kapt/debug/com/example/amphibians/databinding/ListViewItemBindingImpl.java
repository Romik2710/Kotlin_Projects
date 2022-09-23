package com.example.amphibians.databinding;
import com.example.amphibians.R;
import com.example.amphibians.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListViewItemBindingImpl extends ListViewItemBinding implements com.example.amphibians.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ListViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            );
        this.amphibianName.setTag(null);
        this.card.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.amphibians.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.clickListener == variableId) {
            setClickListener((com.example.amphibians.ui.AmphibianListener) variable);
        }
        else if (BR.amphibian == variableId) {
            setAmphibian((com.example.amphibians.network.Amphibian) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable com.example.amphibians.ui.AmphibianListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setAmphibian(@Nullable com.example.amphibians.network.Amphibian Amphibian) {
        this.mAmphibian = Amphibian;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.amphibian);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String AmphibianName1 = null;
        com.example.amphibians.ui.AmphibianListener clickListener = mClickListener;
        com.example.amphibians.network.Amphibian amphibian = mAmphibian;

        if ((dirtyFlags & 0x6L) != 0) {



                if (amphibian != null) {
                    // read amphibian.name
                    AmphibianName1 = amphibian.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amphibianName, AmphibianName1);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.card.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        com.example.amphibians.ui.AmphibianListener clickListener = mClickListener;
        // amphibian
        com.example.amphibians.network.Amphibian amphibian = mAmphibian;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onClick(amphibian);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): amphibian
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}