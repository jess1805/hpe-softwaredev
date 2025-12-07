package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    // existing GET
    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }
    @PostMapping("/employees")
    public Employees addEmployee(@RequestBody Employee employee) {
        // JSON → Employee object (using setters)
        employeeManager.addEmployee(employee);
        // return updated list (so you can see it changed)
        return employeeManager.getAllEmployees();
    }
}
