package com.example.is.employeeservice.repository;


import com.example.is.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}