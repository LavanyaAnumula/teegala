package com.placement.project.model;

import jakarta.persistence.*;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collegeName;
    private String location;
    private String collegeAdmin; // Changed to String

    // Constructors
    public College() {}

    public College(String collegeName, String location, String collegeAdmin) {
        this.collegeName = collegeName;
        this.location = location;
        this.collegeAdmin = collegeAdmin;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollegeAdmin() {
        return collegeAdmin;
    }

    public void setCollegeAdmin(String collegeAdmin) {
        this.collegeAdmin = collegeAdmin;
    }
}