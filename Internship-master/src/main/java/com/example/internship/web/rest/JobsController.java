package com.example.internship.web.rest;

import com.example.internship.Services.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class JobsController {
    @Autowired
    private JobsService jobsService;

    @GetMapping("/job-openings")
    public ResponseEntity getAllJobOpenings(){
        return ResponseEntity.ok().body(jobsService.findAllOpenings());
    }

}
