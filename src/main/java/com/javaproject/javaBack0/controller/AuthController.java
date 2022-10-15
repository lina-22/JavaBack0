package com.javaproject.javaBack0.controller;


import com.javaproject.javaBack0.model.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/")
public class AuthController {


    @RequestMapping(value = "/welcome1",method = RequestMethod.GET)
    public String welcome(){
        return "you are welcome";
    }


    @GetMapping("/hello")
    public String printHelloWorld(){
        return "hello world";
    }


  /*  @PostMapping("/hello1")
    public String getYourName(@RequestParam String name){
        return "hello world" +name;
    }*/

    /*hasMap apply*/
    @PostMapping("/hello1")
    public String getYourName(@RequestParam String name, @RequestBody UserModel userModel) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        return "hello world" +userModel.getName();
    }
}

