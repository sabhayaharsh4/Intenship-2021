package com.example.internship.web.rest;

import com.example.internship.Domain.CampusAmbassador;
import com.example.internship.Services.CampusAmbassadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CampusAmbassadorController {
    @Autowired
    private CampusAmbassadorService campusAmbassadorService;

    @PostMapping("/campus-ambassador-register")
    public ResponseEntity campusAmbassadorRegister(@RequestBody CampusAmbassador data){
        return campusAmbassadorService.register(data);
    }

    @GetMapping("/view-campus-ambassador")
    public ResponseEntity getAllCampusAmbassadorApplicants(){
        return ResponseEntity.ok().body(campusAmbassadorService.findAll());
    }
}
