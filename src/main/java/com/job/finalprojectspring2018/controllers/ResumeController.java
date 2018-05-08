package com.job.finalprojectspring2018.controllers;

import com.job.finalprojectspring2018.Repositories.ResumeRepository;
import com.job.finalprojectspring2018.models.ResumeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/account/resume")
public class ResumeController {
    @Autowired
    ResumeRepository resumeRepository;

    @GetMapping("/all")
    public List<ResumeModel> getAll(){
        return this.resumeRepository.findAll();
    }
}
