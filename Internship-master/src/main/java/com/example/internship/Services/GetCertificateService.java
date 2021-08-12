package com.example.internship.Services;

import com.example.internship.Domain.GetCertificate;
import com.example.internship.Repository.GetCertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetCertificateService {
    @Autowired
    private GetCertificateRepository getCertificateRepository;

    public Iterable<GetCertificate> findAll(){
        return getCertificateRepository.findAll();
    }

    public ResponseEntity findByEmail(String email) {
        return ResponseEntity.ok().body(
          getCertificateRepository.findGetCertificateByEmail(email)
        );
    }

    public ResponseEntity register(GetCertificate data) {
        getCertificateRepository.save(data);
        return ResponseEntity.accepted().build();
    }
}
