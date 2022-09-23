package com.example.amphibians.databinding;
import com.example.amphibians.R;
import com.example.amphibians.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAmphibianDetailBindingImpl extends FragmentAmphibianDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAmphibianDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentAmphibianDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.description.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.amphibians.ui.AmphibianViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.amphibians.ui.AmphibianViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAmphibian((androidx.lifecycle.LiveData<com.example.amphibians.network.Amphibian>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAmphibian(androidx.lifecycle.LiveData<com.example.amphibians.network.Amphibian> ViewModelAmphibian, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String viewModelAmphibianName = null;
        com.example.amphibians.network.Amphibian viewModelAmphibianGetValue = null;
        androidx.lifecycle.LiveData<com.example.amphibians.network.Amphibian> viewModelAmphibian = null;
        com.example.amphibians.ui.AmphibianViewModel viewModel = mViewModel;
        java.lang.String viewModelAmphibianDescription = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.amphibian
                    viewModelAmphibian = viewModel.getAmphibian();
                }
                updateLiveDataRegistration(0, viewModelAmphibian);


                if (viewModelAmphibian != null) {
                    // read viewModel.amphibian.getValue()
                    viewModelAmphibianGetValue = viewModelAmphibian.getValue();
                }


                if (viewModelAmphibianGetValue != null) {
                    // read viewModel.amphibian.getValue().name
                    viewModelAmphibianName = viewModelAmphibianGetValue.getName();
                    // read viewModel.amphibian.getValue().description
                    viewModelAmphibianDescription = viewModelAmphibianGetValue.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewModelAmphibianDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, viewModelAmphibianName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.amphibian
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}