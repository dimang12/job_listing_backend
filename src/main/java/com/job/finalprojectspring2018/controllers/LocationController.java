package com.job.finalprojectspring2018.controllers;

import com.job.finalprojectspring2018.Repositories.LocationRepository;
import com.job.finalprojectspring2018.models.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/location/cities")
public class LocationController {
    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/all")
    public List<CityModel> getAll(){
        return this.locationRepository.findAll();
    }
}
