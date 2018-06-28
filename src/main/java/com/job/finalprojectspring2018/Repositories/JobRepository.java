package com.job.finalprojectspring2018.Repositories;

import com.job.finalprojectspring2018.models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobRepository extends JpaRepository<JobModel, Integer> {
    List<JobModel> findByCompanyModel_Id(Integer id);

    List<JobModel> findByCityModel_Id(Integer id);

    List<JobModel> findByTitle(String title);

    @Query("SELECT j FROM JobModel j WHERE j.title like %?1%")
    List<JobModel> searchJob(@Param("job") String job);

//    @Query("SELECT j FROM JobModel j WHERE j.companyModel = :id")
//    public List<JobModel> findCompany(@Param("id") Integer id);

}
