package com.job.finalprojectspring2018.Repositories;

import com.job.finalprojectspring2018.models.CompanyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyModel, Integer>{
}
