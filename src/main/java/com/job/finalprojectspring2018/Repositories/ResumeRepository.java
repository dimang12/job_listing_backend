package com.job.finalprojectspring2018.Repositories;

import com.job.finalprojectspring2018.models.ResumeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<ResumeModel, Integer> {

}
