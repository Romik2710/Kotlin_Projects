package com.example.grocery_test

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModal(private val repo: GroceryRepo) : ViewModel() {

    fun insert(items: GroceryItems) = GlobalScope.launch { repo.insert(items) }
    fun delete(items: GroceryItems) = GlobalScope.launch { repo.delete(items) }

    fun getAllGroceryItems() = repo.getAllItems()

}