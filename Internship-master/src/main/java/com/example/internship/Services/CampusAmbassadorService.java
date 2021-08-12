package com.example.internship.Services;

import com.example.internship.Domain.CampusAmbassador;
import com.example.internship.Repository.CampusAmbassadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CampusAmbassadorService {
    @Autowired
    private CampusAmbassadorRepository campusAmbassadorRepository;

    public Iterable<CampusAmbassador> findAll(){
        return campusAmbassadorRepository.findAll();
    }

    public ResponseEntity register(CampusAmbassador data) {
        campusAmbassadorRepository.save(data);
        return ResponseEntity.accepted().build();
    }
}
