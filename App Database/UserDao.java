package com.example.projectthree.SQLite;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface UserDao {

    // Insert User object into DB, replace if conflict
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertUser(UserEntity... users);


    // Query all users from DB
    @Query("SELECT * FROM users")
    public UserEntity[] loadUsers();
}

