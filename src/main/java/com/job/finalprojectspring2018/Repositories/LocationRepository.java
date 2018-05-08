package com.job.finalprojectspring2018.Repositories;

import com.job.finalprojectspring2018.models.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<CityModel, Integer> {

}
