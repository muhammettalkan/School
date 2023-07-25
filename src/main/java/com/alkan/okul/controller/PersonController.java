package com.alkan.okul.controller;


import com.alkan.okul.services.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("people/")
public class PersonController {

    PersonService service;



}
