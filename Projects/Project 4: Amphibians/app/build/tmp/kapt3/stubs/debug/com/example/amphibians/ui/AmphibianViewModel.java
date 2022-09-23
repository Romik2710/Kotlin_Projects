package com.example.amphibians.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/example/amphibians/ui/AmphibianViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_amphibian", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/amphibians/network/Amphibian;", "_amphibians", "", "_status", "Lcom/example/amphibians/ui/AmphibianApiStatus;", "amphibian", "Landroidx/lifecycle/LiveData;", "getAmphibian", "()Landroidx/lifecycle/LiveData;", "amphibians", "getAmphibians", "status", "getStatus", "getAmphibianList", "", "onAmphibianClicked", "app_debug"})
public final class AmphibianViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.amphibians.ui.AmphibianApiStatus> _status = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.amphibians.ui.AmphibianApiStatus> status = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.amphibians.network.Amphibian>> _amphibians = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.amphibians.network.Amphibian>> amphibians = null;
    private final androidx.lifecycle.MutableLiveData<com.example.amphibians.network.Amphibian> _amphibian = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.amphibians.network.Amphibian> amphibian = null;
    
    public AmphibianViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.amphibians.ui.AmphibianApiStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.amphibians.network.Amphibian>> getAmphibians() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.amphibians.network.Amphibian> getAmphibian() {
        return null;
    }
    
    public final void getAmphibianList() {
    }
    
    public final void onAmphibianClicked(@org.jetbrains.annotations.NotNull()
    com.example.amphibians.network.Amphibian amphibian) {
    }
}