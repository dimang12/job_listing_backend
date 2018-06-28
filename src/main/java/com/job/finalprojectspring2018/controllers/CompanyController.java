package com.job.finalprojectspring2018.controllers;

import com.job.finalprojectspring2018.Repositories.CompanyRepository;
import com.job.finalprojectspring2018.models.CompanyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/all")
    public List<CompanyModel> getAll() {
        return this.companyRepository.findAll();
    }
}
