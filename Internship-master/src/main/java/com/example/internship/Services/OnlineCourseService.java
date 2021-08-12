package com.example.internship.Services;

import com.example.internship.Domain.OnlineCourse;
import com.example.internship.Repository.OnlineCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineCourseService {
    @Autowired
    private OnlineCourseRepository onlineCourseRepository;

    public Iterable<OnlineCourse> findAll() {
        return onlineCourseRepository.findAll();
    }

    public ResponseEntity getCourseByPrice(Long price) {
        List<OnlineCourse> courses = onlineCourseRepository.findCourseByPrice(price.doubleValue());
        return ResponseEntity.ok().body(courses);
    }
}
