package com.ictak.practice.controllers;

import com.ictak.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.util.Elements;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
//    @CrossOrigin(origins = "https://localhost:3000")
//    @PostMapping("/login")
//    private RequestBody<Map<String, String>
}
