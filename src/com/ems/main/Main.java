package com.ems.main;

import com.ems.controller.EmployeeController;
import com.ems.model.Admin;
import com.ems.util.Input;


public class Main { 

    private static final int max = 3;

    public static void main(String[] args) {

        Admin admin = new Admin();
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < max) {

            String user = Input.readString("Enter Username: ");
            String pass = Input.readString("Enter Password: ");

            if (admin.validate(user, pass)) {
                System.out.println(" -- > Login Successful <--");
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println(" Invalid Credentials");
                System.out.println("Attempts left: " + (max - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println(" Too many failed login attempts. Application terminated.");
            System.exit(0);
        }

        new EmployeeController();
    }
}
