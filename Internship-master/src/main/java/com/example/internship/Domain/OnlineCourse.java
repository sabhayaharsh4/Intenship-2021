package com.example.internship.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OnlineCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @NonNull
    private String courseName;
    @NonNull
    private String courseAuthor;
    @NonNull
    private String courseDescription;
    @NonNull
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(@NonNull String courseName) {
        this.courseName = courseName;
    }

    @NonNull
    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(@NonNull String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }

    @NonNull
    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(@NonNull String courseDescription) {
        this.courseDescription = courseDescription;
    }

    @NonNull
    public Double getPrice() {
        return price;
    }

    public void setPrice(@NonNull Double price) {
        this.price = price;
    }
}
