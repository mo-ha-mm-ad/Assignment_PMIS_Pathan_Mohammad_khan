package com.ems.model;

public class Admin {
    private final String username = "admin";
    private final String password = "admin123";

    public boolean validate(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}