package com.example.is.departmentservice.repository;


import com.example.is.departmentservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
