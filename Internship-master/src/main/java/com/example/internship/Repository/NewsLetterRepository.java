package com.example.internship.Repository;

import com.example.internship.Domain.NewsLetter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NewsLetterRepository extends CrudRepository<NewsLetter, Long> {
    @Query(value = "select newsletter from NewsLetter newsletter where newsletter.email = :email")
    Optional<NewsLetter> findByEmail(@Param("email") String email);
}
