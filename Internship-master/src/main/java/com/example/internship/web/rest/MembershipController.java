package com.example.internship.web.rest;

import com.example.internship.Domain.Membership;
import com.example.internship.Repository.MembershipRepository;
import com.example.internship.Services.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MembershipController {
    @Autowired
    private MembershipService membershipService;

    @GetMapping("/get-members")
    public ResponseEntity getAll(){ return ResponseEntity.ok().body(membershipService.findAll());}

    @PostMapping("/register-for-membership")
    public ResponseEntity register(Membership data){
        return membershipService.register(data);
    }
}
