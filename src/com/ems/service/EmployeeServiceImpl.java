package com.ems.service;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.util.Input;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repo = new EmployeeRepository();

    @Override
    public void addEmployee() {
        int id;
        while (true) {
            id = Input.readInt("Enter Employee ID: ");
            if (!repo.existsById(id)) 
            	break;
            System.out.println(" Employee ID already exists. Enter a unique ID.");
        }

        String name = Input.readString("Enter Name: ");
        String dept = Input.readString("Enter Department: ");
        double salary = Input.readDouble("Enter Salary: ");

        repo.add(new Employee(id, name, dept, salary));
        System.out.println(" Employee added successfully");
    }

    @Override
    public void viewEmployees() {
        if (repo.getAll().isEmpty()) {
            System.out.println(" No employees found");
            return;
        }
        System.out.println("ID | Name | Dept | Salary");
        for (Employee e : repo.getAll()) {
            System.out.println(e);
        }
    }

    @Override
    public void updateEmployee() {
        int id = Input.readInt("Enter Employee ID to update: ");
        Employee emp = repo.findById(id);

        if (emp == null) {
            System.out.println(" Employee not found");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- Update Employee Menu ---");
            System.out.println("1. Update Name");
            System.out.println("2. Update Department");
            System.out.println("3. Update Salary");
            System.out.println("4. Update All Details");
            System.out.println("5. Back");

            choice = Input.readInt("Enter choice: ");

            switch (choice) {

                case 1:
                    emp.setName(Input.readString("Enter New Name: "));
                    System.out.println(" Name updated successfully");
                    break;

                case 2:
                    emp.setDepartment(Input.readString("Enter New Department: "));
                    System.out.println(" Department updated successfully");
                    break;

                case 3:
                    emp.setSalary(Input.readDouble("Enter New Salary: "));
                    System.out.println(" Salary updated successfully");
                    break;

                case 4:
                    emp.setName(Input.readString("Enter New Name: "));
                    emp.setDepartment(Input.readString("Enter New Department: "));
                    emp.setSalary(Input.readDouble("Enter New Salary: "));
                    System.out.println(" All details updated successfully");
                    break;

                case 5:
                    System.out.println("Returning to main menu");
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while (choice != 5);
    }


    @Override
    public void deleteEmployee() {
        int id = Input.readInt("Enter Employee ID to delete: ");
        if (repo.delete(id)) {
            System.out.println(" --> Employee deleted successfully <-- ");
        } else {
            System.out.println(" Employee not found");
        }
    }
}
