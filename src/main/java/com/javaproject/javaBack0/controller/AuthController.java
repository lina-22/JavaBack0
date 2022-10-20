package com.javaproject.javaBack0.controller;


import com.javaproject.javaBack0.model.MessageResponse;
import com.javaproject.javaBack0.model.UserModel;
import com.javaproject.javaBack0.repository.UserRepository;
import com.javaproject.javaBack0.request.UserModelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/")
public class AuthController {

    @Autowired
    UserRepository mUserRepository;


    @PostMapping("/registration")
    public ResponseEntity<?> registration(@RequestBody UserModelRequest userModelRequest) {
        if(userModelRequest.getFirstName().isEmpty()){

        boolean exists = mUserRepository.existsByEmail(userModelRequest.getEmail());
        if (exists) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already taken!"));
        }
        }
        //database






        return ResponseEntity.ok(userModelRequest);
    }

}

