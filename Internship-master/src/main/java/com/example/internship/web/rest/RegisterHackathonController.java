package com.example.internship.web.rest;

import com.example.internship.Domain.RegisterHackathon;
import com.example.internship.Services.RegisterHackathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RegisterHackathonController{
    @Autowired
    private RegisterHackathonService registerHackathonService;

    @GetMapping("/participants-for-hackathon")
    public ResponseEntity getAll(){return ResponseEntity.ok().body(registerHackathonService.findAll());}

    @PostMapping("/register-for-hackathon")
    public ResponseEntity register(RegisterHackathon data){
        return registerHackathonService.register(data);
    }
}
