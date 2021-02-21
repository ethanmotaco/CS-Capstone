package com.example.projectthree.SQLite;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//SQLite table name users
@Entity(tableName = "users")
public class UserEntity {

    //Auto generate primary key as Long
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public Long id;

    //username must not be null
    @NonNull
    public String username;

    //password must not be null
    @NonNull
    public String password;

    //getters for username and password
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    //constructor for UserEntity object
    public UserEntity(String username,
                      String password) {
        this.username = username;
        this.password = password;
    }
}
