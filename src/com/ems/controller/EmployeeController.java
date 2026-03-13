package com.ems.controller;

import com.ems.service.EmployeeService;
import com.ems.service.EmployeeServiceImpl;
import com.ems.view.EmployeeView;

public class EmployeeController {
	
	public EmployeeController() {
		this.start();
		}
	

    private final EmployeeService service = new EmployeeServiceImpl();
    private final EmployeeView view = new EmployeeView();

   
    private void start() {
        int choice;
        do {
            choice = view.showMenu();
            switch (choice) {
                case 1:
                	service.addEmployee();
                	break;
                case 2 :
                	service.viewEmployees();
                	break;
                case 3:
                	service.updateEmployee();
                	break;
                case 4 :
                	service.deleteEmployee();
                	break;
                case 5 : 
                	System.out.println("Logged out");
                	break;
                default:
                	System.out.println(""
                			+ "Invalid choice");
            }
        } while (choice != 5);
    }
}
