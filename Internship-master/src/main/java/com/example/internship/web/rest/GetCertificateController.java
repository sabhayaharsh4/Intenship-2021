package com.example.internship.web.rest;

import com.example.internship.Domain.GetCertificate;
import com.example.internship.Services.GetCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class GetCertificateController {
    @Autowired
    private GetCertificateService getCertificateService;

    @GetMapping("/get-all-Certificates")
    public ResponseEntity getAll(){ return ResponseEntity.ok().body(getCertificateService.findAll());}

    @GetMapping("/get-certificate/{email}")
    public ResponseEntity findCertificateByEmail(@PathVariable String email){
        return getCertificateService.findByEmail(email);
    }

    @PostMapping("register-for-certificate")
    public ResponseEntity register(@RequestBody GetCertificate data){
        return getCertificateService.register(data);
    }
}
