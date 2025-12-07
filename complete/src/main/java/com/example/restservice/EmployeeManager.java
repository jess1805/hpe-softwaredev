package com.example.restservice;

import org.springframework.stereotype.Component;

//@Component
//public class EmployeeManager {
//
//    private Employees employees;
//
//    public EmployeeManager() {
//        employees = new Employees();
//
//        // hard-coded example employees
//        employees.getEmployees().add(
//                new Employee("E001", "Alice", "Johnson", "alice.johnson@example.com", "Software Engineer")
//        );
//        employees.getEmployees().add(
//                new Employee("E002", "Bob", "Smith", "bob.smith@example.com", "Senior Engineer")
//        );
//        employees.getEmployees().add(
//                new Employee("E003", "Carol", "Davis", "carol.davis@example.com", "Manager")
//        );
//    }
//
//    public Employees getAllEmployees() {
//        return employees;
//    }
//}

@Component
public class EmployeeManager {

    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();

        employees.getEmployees().add(
                new Employee("E001", "Alice", "Johnson", "alice.johnson@example.com", "Software Engineer"));
        employees.getEmployees().add(
                new Employee("E002", "Bob", "Smith", "bob.smith@example.com", "Senior Engineer"));
        employees.getEmployees().add(
                new Employee("E003", "Carol", "Davis", "carol.davis@example.com", "Manager"));
    }

    public Employees getAllEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.getEmployees().add(employee);
    }
}

