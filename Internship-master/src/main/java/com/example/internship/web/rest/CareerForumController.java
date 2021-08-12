package com.example.internship.web.rest;

import com.example.internship.Domain.CareerForum;
import com.example.internship.Services.CareerForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import javax.persistence.GeneratedValue;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CareerForumController {
    @Autowired
    private CareerForumService careerForumService;

    @GetMapping("get-all-career-forum-applicants")
    public ResponseEntity getAll(){
        return ResponseEntity.ok().body(careerForumService.findAll());
    }

    @PostMapping("register-career-forum")
    public ResponseEntity register(CareerForum data){
        return careerForumService.register(data);
    }
}
