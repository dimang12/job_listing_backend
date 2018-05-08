package com.job.finalprojectspring2018.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cities")
public class CityModel {
    @Id
    @Column(name = "id")
    private int id;

    @Column (name = "title")
    private String title;

    @Column (name = "job_number")
    private int job_number;

    @Column (name = "ordering")
    private int ordering;

    @Column (name = "is_published")
    private boolean is_published;

    public CityModel(){
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getJob_number() {
        return job_number;
    }

    public int getOrdering() {
        return ordering;
    }

    public boolean isIs_published() {
        return is_published;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setJob_number(int job_number) {
        this.job_number = job_number;
    }

    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    public void setIs_published(boolean is_published) {
        this.is_published = is_published;
    }
}
