package com.job.finalprojectspring2018.controllers;

import com.job.finalprojectspring2018.Repositories.JobRepository;
import com.job.finalprojectspring2018.models.JobModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping ("/jobs")
public class JobController {
    @Autowired
    JobRepository jobRepository;

    @GetMapping("/all")
    public List<JobModel> getAll(){
        return this.jobRepository.findAll();
    }
}
