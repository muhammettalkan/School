package com.alkan.okul.controller;

import com.alkan.okul.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students/")
public class StudentController {

    @Autowired
    StudentService service;

}
