package com.example.internship.Repository;

import com.example.internship.Domain.CareerForum;
import com.example.internship.Services.CareerForumService;
import org.springframework.data.repository.CrudRepository;

public interface CareerForumRepository extends CrudRepository<CareerForum, Long> {
}
