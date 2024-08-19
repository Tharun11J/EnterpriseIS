package com.example.is.companyservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.is.companyservice.model.Company;
import com.example.is.companyservice.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}