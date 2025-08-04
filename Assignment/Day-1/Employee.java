/*
 9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor 
 Employee(int empId, String name, String department, double salary) and 
 assign these variables to instance variables accordingly and display them?
 */

public class Employee {
    
    int empId;
    String name;
    String department;
    double salary;

    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "Alice", "IT", 65000);
        Employee emp2 = new Employee(102, "Bob", "HR", 55000);

        emp1.display();
        emp2.display();
    }
}


