package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeManagerTests {

    @Test
    void initialEmployeeListHasHardcodedEmployees() {
        EmployeeManager manager = new EmployeeManager();

        int size = manager.getAllEmployees().getEmployees().size();

        assertTrue(size >= 3, "There should be at least 3 initial employees");
    }

    @Test
    void addEmployeeShouldIncreaseListSize() {
        EmployeeManager manager = new EmployeeManager();

        int before = manager.getAllEmployees().getEmployees().size();

        Employee newEmp = new Employee(
                "E999",
                "Unit",
                "Test",
                "unit.test@example.com",
                "Tester"
        );

        manager.addEmployee(newEmp);

        int after = manager.getAllEmployees().getEmployees().size();

        assertEquals(before + 1, after, "List size should increase by 1");
    }
}
