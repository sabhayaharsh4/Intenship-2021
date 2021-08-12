package com.example.internship.Repository;

import com.example.internship.Domain.OnlineCourse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OnlineCourseRepository extends CrudRepository<OnlineCourse,Long> {

    @Query(value = "select course from OnlineCourse course where course.price <= :price")
    List<OnlineCourse> findCourseByPrice(@Param("price") Double price);
}
