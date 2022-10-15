package com.javaproject.javaBack0.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthController {


    @RequestMapping(value = "/welcome1",method = RequestMethod.GET)
    public String welcome(){
          return "you are welcome";
    }
}
