package com.javaproject.javaBack0.controller;

import com.javaproject.javaBack0.model.CategoryModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    public ResponseEntity<?> create(@RequestBody CategoryModel categoryModel){

    }
}
