package com.job.finalprojectspring2018.Repositories;

import com.job.finalprojectspring2018.models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobModel, Integer> {

}
