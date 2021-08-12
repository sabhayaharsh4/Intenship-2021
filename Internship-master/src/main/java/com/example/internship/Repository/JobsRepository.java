package com.example.internship.Repository;

import com.example.internship.Domain.Jobs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository  extends CrudRepository<Jobs, Long> {

    @Query(value = "select jobs from Jobs jobs where jobs.openings > 0")
    Iterable<Jobs> findAllOpenings();
}
