package com.example.internship.Domain;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegisterHackathon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private  String lastName;
    @NonNull
    private String email;
    @NonNull
    private String mobilenumber;
    @NonNull
    private String teamName;
    @NonNull
    private String address;
    @NonNull
    private String idea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NonNull String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(@NonNull String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    @NonNull
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(@NonNull String teamName) {
        this.teamName = teamName;
    }

    @NonNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    @NonNull
    public String getIdea() {
        return idea;
    }

    public void setIdea(@NonNull String idea) {
        this.idea = idea;
    }
}

