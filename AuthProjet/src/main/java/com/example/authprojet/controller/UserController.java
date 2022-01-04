package com.example.authprojet.controller;

import com.example.authprojet.dao.UserRepository;
import com.example.authprojet.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("user")
    public void insertUser(@RequestBody User user){
        userRepository.save(user);
    }
}
