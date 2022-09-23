package com.example.chandrikagroceryapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface GroceryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(items: GroceryItems)

    @Delete
    suspend fun delete(items: GroceryItems)

    @Query("SELECT * FROM grocerry_items")
    fun getAllGroceryItems() :LiveData<List<GroceryItems>>

}
