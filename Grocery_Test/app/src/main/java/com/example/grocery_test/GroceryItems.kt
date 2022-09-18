package com.example.grocery_test

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "grocery_items")
data class GroceryItems (

    @ColumnInfo(name = "itemName")
    var itemName : String,

    @ColumnInfo(name = "itemQuantity")
    @PrimaryKey(autoGenerate=true)
    var itemQuantity : Int,

    @ColumnInfo(name = "itemPrice")
    var itemPrice : Int,
    
    ){
}
