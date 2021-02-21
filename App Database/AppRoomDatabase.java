package com.example.projectthree.SQLite;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

//remember to change version when schema is changed
@Database(entities = {UserEntity.class, InventoryEntity.class},
        version = 2)
public abstract class AppRoomDatabase extends RoomDatabase {

    //declare variables
    public abstract UserDao userDao();
    public abstract InventoryDao inventoryDao();
    private static volatile AppRoomDatabase appRoomInstance;

    //call getDatabase and pass context to return database instance
    public static AppRoomDatabase getDatabase(final Context context) {
        //if there is no instance, create one
        if (appRoomInstance == null) {
            synchronized (AppRoomDatabase.class) {
                if (appRoomInstance == null) {
                    //build database
                    appRoomInstance = Room.databaseBuilder(context.getApplicationContext(),
                            AppRoomDatabase.class, "app_database")
                            //use destructive migration if necessary
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        //return database
        return appRoomInstance;
    }
}
