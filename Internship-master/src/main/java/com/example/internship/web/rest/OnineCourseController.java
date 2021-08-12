package com.example.internship.web.rest;

import com.example.internship.Domain.OnlineCourse;
import com.example.internship.Services.OnlineCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class OnineCourseController {
    @Autowired
    private OnlineCourseService onlineCourseService;

    @GetMapping("/Select-A-Course")
    public ResponseEntity getAll(){
        return ResponseEntity.ok().body(onlineCourseService.findAll());
    }

    @GetMapping("/get-course")
    public ResponseEntity getCourseByFilter(@RequestParam Long price){
        return onlineCourseService.getCourseByPrice(price);
    }

}
