package com.example.internship.web.rest;

import com.example.internship.Domain.User;
import com.example.internship.Services.DTO.LoginDTO;
import com.example.internship.Services.DTO.UserDTO;
import com.example.internship.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> save(@RequestBody UserDTO userDTO) {
        User user = null;
        try {
            user = userService.save(userDTO);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/get-all-users")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDTO loginDTO) {
        return userService.login(loginDTO);
    }
}
