/*

Reference ChatGpt Link: https://chatgpt.com/share/67bf36da-e00c-8004-b9d6-3e54efa15f89 (How to fix id and createdAt not getting automatically added to the json)
Before id and createdAt was in the parameter constructor and after doing POST id and createdAt field was null.

*/

package com.samiulsifat.task_management.model;

import jakarta.validation.constraints.NotNull;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class User {
    String id, createdAt;

    @NotNull
    String username, email, password;

    public User() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = String.valueOf(new Timestamp(Long.parseLong(String.valueOf(new Date().getTime()))));
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
//        this.createdAt = String.valueOf(new Date().getTime());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
