package com.example.crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceEmpli implements EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String creatEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee Created Successfully";
    }

    @Override
    public List<Employee> readEmplyees() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean deleteEmployee(String id) {
        employeeRepository.deleteById(id); 
        return true;
    }
}
