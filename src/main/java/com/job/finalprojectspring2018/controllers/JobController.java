package com.job.finalprojectspring2018.controllers;

import com.job.finalprojectspring2018.Repositories.JobRepository;
import com.job.finalprojectspring2018.models.JobModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/detail/{id}")
    public Optional<JobModel> getDetail(@PathVariable Integer id) {
        return this.jobRepository.findById(id);
    }

    @GetMapping(value = "/company/{id}")
    public List<JobModel> getJobsByCompany( @PathVariable Integer id) {
        return this.jobRepository.findByCompanyModel_Id(id);
    }

    @GetMapping(value = "/city/{id}")
    public List<JobModel> getJobsByLocation (@PathVariable Integer id) {
        return  this.jobRepository.findByCityModel_Id(id);
    }

    @GetMapping(value = "/search/{job}")
    public List<JobModel> getJobsSearch(@PathVariable String job) {
        if (!job.equals("")){
            return this.jobRepository.searchJob(job);
        }else {
            return null;
        }
    }
}
