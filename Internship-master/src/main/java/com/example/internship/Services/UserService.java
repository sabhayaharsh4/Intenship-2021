package com.example.internship.Services;

import com.example.internship.Domain.User;
import com.example.internship.Services.DTO.LoginDTO;
import com.example.internship.Services.DTO.UserDTO;
import com.example.internship.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(UserDTO userDTO) throws Exception {
        Optional<User> userInDB = userRepository.findAllByEmail(userDTO.getEmail());
        if(userInDB.isEmpty()){
            User user = new User(userDTO);
            user.setRegisteredDate(new Date());
            return userRepository.save(user);
        } else{
            throw new Exception("User already there");
        }
    }

    public ResponseEntity login(LoginDTO loginDTO) {
        AtomicBoolean successful = new AtomicBoolean(false);
        Optional<User> user = userRepository.findAllByEmail(loginDTO.getEmail());

        if(user.isPresent()){
            user.get().setLastLoggedInDate(new Date());
            userRepository.save(user.get());
            return ResponseEntity.accepted().build();
        }

        return ResponseEntity.badRequest().build();
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
