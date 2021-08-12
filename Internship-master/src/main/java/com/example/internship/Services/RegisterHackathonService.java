package com.example.internship.Services;

import com.example.internship.Domain.RegisterHackathon;
import com.example.internship.Repository.RegisterHackathonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegisterHackathonService {
    @Autowired
    private RegisterHackathonRepository registerHackathonRepository;

    public Iterable<RegisterHackathon> findAll(){
        return registerHackathonRepository.findAll();
    }

    public ResponseEntity register(RegisterHackathon data) {
        registerHackathonRepository.save(data);
        return ResponseEntity.accepted().build();
    }
}
