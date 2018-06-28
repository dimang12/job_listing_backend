package com.job.finalprojectspring2018.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;

@Entity
@Table (name = "jobs")
public class JobModel {
    @Id
    @Column (name = "id")
    private int id;
    @Column (name = "title")
    private String title;
//    @Column (name = "city_id")
//    private int city;
    @Column (name = "job_type")
    private int jobType;
    @Column (name = "salary")
    private float salary;
    @Column (name = "summary")
    private String summary;
    @Column (name = "duty")
    private String duty;
    @Column (name = "requirement")
    private String requirement;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    private CityModel cityModel;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private CompanyModel companyModel;

    public JobModel() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getJobType() {
        return jobType;
    }

    public float getSalary() {
        return salary;
    }

    public String getSummary() {
        return summary;
    }

    public String getDuty() {
        return duty;
    }

    public String getRequirement() {
        return requirement;
    }

    public CityModel getCityModel() {
        return cityModel;
    }

    public CompanyModel getCompanyModel() {
        return companyModel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public void setCityModel(CityModel cityModel) {
        this.cityModel = cityModel;
    }

    public void setCompanyModel(CompanyModel companyModel) {
        this.companyModel = companyModel;
    }

//    @Query("FROM jobs WHERE c.Application.id = :applicationId")
//    List<JobModel> findValidCompialiton(@Param("id") Long applicationId);


}
