package com.example.crud;

import java.util.List;

// This Service layer is responsible for all the type
public interface EmployeeService {
    String creatEmployee(Employee employee);

    List<Employee> readEmplyees();

    boolean deleteEmployee(String id);
}
