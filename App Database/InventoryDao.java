package com.example.projectthree.SQLite;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface InventoryDao {

    // Insert InventoryEntities to DB, replace if conflict
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertInventoryItem(InventoryEntity... InventoryEntities);

    // Delete specified InventoryEntities
    @Delete
    public void deleteInventoryItem(InventoryEntity... InventoryEntities);

     // Query all inventory items from DB
    @Query("SELECT * FROM inventory")
    public InventoryEntity[] loadAllInventory();

    @Query("SELECT * FROM inventory WHERE itemColor = :color")
    public InventoryEntity[] loadByColor(String color);

    @Query("SELECT * FROM inventory WHERE itemMass <= :mass")
    public InventoryEntity[] loadByMaxMass(double mass);

    @Query("SELECT * FROM inventory WHERE itemVolume <= :vol")
    public InventoryEntity[] loadByMaxVol(double vol);

}
