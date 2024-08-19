package com.example.is.companyservice.repository;

import com.example.is.companyservice.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
