package com.example.amphibians;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\f"}, d2 = {"bindRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/example/amphibians/network/Amphibian;", "bindStatus", "statusImageView", "Landroid/widget/ImageView;", "status", "Lcom/example/amphibians/ui/AmphibianApiStatus;", "app_debug"})
public final class BindingAdaptersKt {
    
    /**
     * Updates the data shown in the [RecyclerView]
     */
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.amphibians.network.Amphibian> data) {
    }
    
    /**
     * This binding adapter displays the [AmphibianApiStatus] of the network request in an image view.
     * When the request is loading, it displays a loading_animation.  If the request has an error, it
     * displays a broken image to reflect the connection error.  When the request is finished, it
     * hides the image view.
     */
    @androidx.databinding.BindingAdapter(value = {"apiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView statusImageView, @org.jetbrains.annotations.Nullable()
    com.example.amphibians.ui.AmphibianApiStatus status) {
    }
}