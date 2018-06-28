package com.job.finalprojectspring2018.models;

import javax.persistence.*;

@Entity( name = "companies" )
public class CompanyModel {
    @Id
    @Column (name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "name", length = 120)
    private String companyName;

    @Column (name = "summary", length = 500)
    private String companySummary;

    @Column( name = "rate")
    private int rate;

    public CompanyModel(){}



    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanySummary() {
        return companySummary;
    }

    public int getRate() {
        return rate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanySummary(String companySummary) {
        this.companySummary = companySummary;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
