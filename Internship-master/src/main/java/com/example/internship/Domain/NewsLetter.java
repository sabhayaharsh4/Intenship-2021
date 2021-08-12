package com.example.internship.Domain;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class NewsLetter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String fullName;
    @NonNull
    private String email;
    @NonNull
    private String collegeName;
    @NonNull
    private String mobileNumber;

    public NewsLetter() {
    }

    public NewsLetter(NewsLetter newsLetter){
        this.fullName = newsLetter.getFullName();
        this.email = newsLetter.getEmail();
        this.collegeName = newsLetter.getCollegeName();
        this.mobileNumber= newsLetter.getMobileNumber();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collageName) {
        this.collegeName = collageName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
