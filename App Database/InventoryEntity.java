package com.example.projectthree.SQLite;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//SQLite table name inventory
@Entity(tableName = "inventory")
public class InventoryEntity {

    //Primary key is item name to ensure there is only one of each item in DB
    @PrimaryKey
    @NonNull
    public String itemName;

    //ItemCount must not be null, int cannot be null
    @NonNull
    public int itemCount;

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public double getItemMass() {
        return itemMass;
    }

    public void setItemMass(double itemMass) {
        this.itemMass = itemMass;
    }

    public double getItemVolume() {
        return itemVolume;
    }

    public void setItemVolume(double itemVolume) {
        this.itemVolume = itemVolume;
    }

    public String itemColor;

    public double itemMass;

    public double itemVolume;

    //Setters for inventory items
    public void setItemName(@NonNull String itemName) {
        this.itemName = itemName;
    }
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    //Getters for inventory items
    public String getItemName() {
        return itemName;
    }
    public int getItemCount() {
        return itemCount;
    }

    //Constructor for inventory item object
    public InventoryEntity(String itemName,
                           int itemCount) {
        this.itemName = itemName;
        this.itemCount = itemCount;
    }

}
