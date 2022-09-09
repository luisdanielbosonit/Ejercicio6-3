package com.bosonit.training.paths.controller;

public class User {

    long id;
    String name;
    String city;
    String email;

    public User(long id, String name, String city, String email) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
