package com.job.finalprojectspring2018.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "jobs")
public class JobModel {
    @Id
    @Column (name = "id")
    private int id;
    @Column (name = "title")
    private String title;
    @Column (name = "city")
    private int city;
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

    public JobModel() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCity() {
        return city;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCity(int city) {
        this.city = city;
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
}
