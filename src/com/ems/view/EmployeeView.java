package com.ems.view;

import com.ems.util.Input;

public class EmployeeView {

    public int showMenu() {
        System.out.println("\n--- Employee Management Menu ---");
        System.out.println("1. Create Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        
        return Input.readInt("Enter choice: ");
    }
}
