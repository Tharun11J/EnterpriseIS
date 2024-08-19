package com.example.is.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.is.employeeservice.model.Employee;
import com.example.is.employeeservice.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
}