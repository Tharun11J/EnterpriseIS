package com.example.is.departmentservice.service;

import com.example.is.departmentservice.model.Department;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.is.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
