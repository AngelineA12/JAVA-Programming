package com.EliteThreads.shoppingapp.model;

public class User {
    private String username;
    private String gender;
    private int age;

    public User(String username, String gender, int age) {
        this.username = username;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
