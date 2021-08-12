package com.example.internship.Services;

import com.example.internship.Domain.NewsLetter;
import com.example.internship.Repository.NewsLetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NewsLetterService {
    @Autowired
    private NewsLetterRepository newsLetterRepository;

    public ResponseEntity register(NewsLetter newsLetter) {
        if(newsLetterRepository.findByEmail(newsLetter.getEmail()).isPresent()){
            return ResponseEntity.badRequest().build();
        }
        else {
            newsLetterRepository.save(newsLetter);
            return ResponseEntity.accepted().build();
        }
    }

    public Iterable<NewsLetter> getAllUsersRegisteredForNewsLetter(){
        return newsLetterRepository.findAll();
    }
}
