package com.example.hrmanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmanagement.model.Employee;
import com.example.hrmanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}