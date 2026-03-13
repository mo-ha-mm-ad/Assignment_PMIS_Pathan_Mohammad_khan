package com.ems.repository;

import java.util.ArrayList;
import java.util.List;
import com.ems.model.Employee;

public class EmployeeRepository {


    private final List<Employee> employees = new ArrayList<>();

    public void add(Employee emp) {
        employees.add(emp);
    }

    public List<Employee> getAll() {
        return employees;
    }
    

    public Employee findById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) 
            	return e;
        }
        return null;
    }

    public boolean existsById(int id) {
        return findById(id) != null;
    }

    public boolean delete(int id) {
        Employee emp = findById(id);
        if (emp != null) {
            employees.remove(emp);
            return true;
        }
        return false;
    }
}
