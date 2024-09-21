package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller where we define all of the REST APIs
@RestController
@RequestMapping("/employees") // Base path for all employee-related endpoints
public class EmpRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.readEmplyees();
    }

    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.creatEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable String id) {
        if (employeeService.deleteEmployee(id)) {
            return "Deleted Successfully";
        } else {
            return "Error in Deleting the Employee";
        }
    }
}
