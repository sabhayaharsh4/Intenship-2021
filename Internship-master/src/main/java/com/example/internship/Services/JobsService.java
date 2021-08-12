package com.example.internship.Services;

import com.example.internship.Domain.Jobs;
import com.example.internship.Repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsService {

    @Autowired
    private JobsRepository jobsRepository;

    public Iterable<Jobs> findAllOpenings() {
        return jobsRepository.findAllOpenings();
    }
}
