package com.example.amphibians.ui;

import java.lang.System;

/**
 * This class implements a [RecyclerView] [ListAdapter] which uses Data Binding to present [List]
 * data, including computing diffs between lists.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/amphibians/ui/AmphibianListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/amphibians/network/Amphibian;", "Lcom/example/amphibians/ui/AmphibianListAdapter$AmphibianViewHolder;", "clickListener", "Lcom/example/amphibians/ui/AmphibianListener;", "(Lcom/example/amphibians/ui/AmphibianListener;)V", "getClickListener", "()Lcom/example/amphibians/ui/AmphibianListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AmphibianViewHolder", "DiffCallback", "app_debug"})
public final class AmphibianListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.amphibians.network.Amphibian, com.example.amphibians.ui.AmphibianListAdapter.AmphibianViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.amphibians.ui.AmphibianListener clickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.amphibians.ui.AmphibianListAdapter.DiffCallback DiffCallback = null;
    
    public AmphibianListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.amphibians.ui.AmphibianListener clickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.amphibians.ui.AmphibianListener getClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.amphibians.ui.AmphibianListAdapter.AmphibianViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.amphibians.ui.AmphibianListAdapter.AmphibianViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/example/amphibians/ui/AmphibianListAdapter$AmphibianViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/amphibians/databinding/ListViewItemBinding;", "(Lcom/example/amphibians/databinding/ListViewItemBinding;)V", "getBinding", "()Lcom/example/amphibians/databinding/ListViewItemBinding;", "setBinding", "bind", "", "clickListener", "Lcom/example/amphibians/ui/AmphibianListener;", "amphibian", "Lcom/example/amphibians/network/Amphibian;", "app_debug"})
    public static final class AmphibianViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.amphibians.databinding.ListViewItemBinding binding;
        
        public AmphibianViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.amphibians.databinding.ListViewItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.amphibians.databinding.ListViewItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.amphibians.databinding.ListViewItemBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.amphibians.ui.AmphibianListener clickListener, @org.jetbrains.annotations.NotNull()
        com.example.amphibians.network.Amphibian amphibian) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/amphibians/ui/AmphibianListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/amphibians/network/Amphibian;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.amphibians.network.Amphibian> {
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.amphibians.network.Amphibian oldItem, @org.jetbrains.annotations.NotNull()
        com.example.amphibians.network.Amphibian newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.amphibians.network.Amphibian oldItem, @org.jetbrains.annotations.NotNull()
        com.example.amphibians.network.Amphibian newItem) {
            return false;
        }
    }
}