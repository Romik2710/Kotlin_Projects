package com.example.amphibians.databinding;
import com.example.amphibians.R;
import com.example.amphibians.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAmphibianListBindingImpl extends FragmentAmphibianListBinding  {

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

    public FragmentAmphibianListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentAmphibianListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        this.statusImage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.example.amphibians.ui.AmphibianApiStatus>) object, fieldId);
            case 1 :
                return onChangeViewModelAmphibians((androidx.lifecycle.LiveData<java.util.List<com.example.amphibians.network.Amphibian>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.example.amphibians.ui.AmphibianApiStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAmphibians(androidx.lifecycle.LiveData<java.util.List<com.example.amphibians.network.Amphibian>> ViewModelAmphibians, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.util.List<com.example.amphibians.network.Amphibian> viewModelAmphibiansGetValue = null;
        androidx.lifecycle.LiveData<com.example.amphibians.ui.AmphibianApiStatus> viewModelStatus = null;
        com.example.amphibians.ui.AmphibianApiStatus viewModelStatusGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.example.amphibians.network.Amphibian>> viewModelAmphibians = null;
        com.example.amphibians.ui.AmphibianViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(0, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.amphibians
                        viewModelAmphibians = viewModel.getAmphibians();
                    }
                    updateLiveDataRegistration(1, viewModelAmphibians);


                    if (viewModelAmphibians != null) {
                        // read viewModel.amphibians.getValue()
                        viewModelAmphibiansGetValue = viewModelAmphibians.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.amphibians.BindingAdaptersKt.bindRecyclerView(this.recyclerView, viewModelAmphibiansGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.amphibians.BindingAdaptersKt.bindStatus(this.statusImage, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): viewModel.amphibians
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}