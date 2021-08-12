package com.example.internship.web.rest;

import com.example.internship.Domain.NewsLetter;
import com.example.internship.Services.NewsLetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class NewsLetterController {
    @Autowired
    private NewsLetterService newsLetterService;

    @PostMapping("/register-for-newsLetter")
    public ResponseEntity register(@RequestBody NewsLetter newsLetter){
        return newsLetterService.register(newsLetter);
    }

    @GetMapping("/get-all-users-of-newsLetter")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(newsLetterService.getAllUsersRegisteredForNewsLetter());
    }
}
