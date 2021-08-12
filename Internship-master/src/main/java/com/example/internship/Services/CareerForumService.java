package com.example.internship.Services;

import com.example.internship.Domain.CareerForum;
import com.example.internship.Repository.CareerForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CareerForumService {
    @Autowired
    private CareerForumRepository careerForumRepository;

    public Iterable<CareerForum> findAll(){
        return careerForumRepository.findAll();
    }

    public ResponseEntity register(CareerForum data) {
        careerForumRepository.save(data);
        return ResponseEntity.ok().build();
    }
}
