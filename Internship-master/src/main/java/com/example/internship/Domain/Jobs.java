package com.example.internship.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String position;
    @NonNull
    private String domain;
    @NonNull
    private String salary;
    @NonNull
    private String location;
    private Long openings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getPosition() {
        return position;
    }

    public void setPosition(@NonNull String position) {
        this.position = position;
    }

    @NonNull
    public String getDomain() {
        return domain;
    }

    public void setDomain(@NonNull String domain) {
        this.domain = domain;
    }

    @NonNull
    public String getSalary() {
        return salary;
    }

    public void setSalary(@NonNull String salary) {
        this.salary = salary;
    }

    @NonNull
    public String getLocation() {
        return location;
    }

    public void setLocation(@NonNull String location) {
        this.location = location;
    }

    public Long getOpenings() {
        return openings;
    }

    public void setOpenings(Long openings) {
        this.openings = openings;
    }
}
