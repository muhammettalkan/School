package com.alkan.okul.controller;

import com.alkan.okul.Responses.PersonDto;
import com.alkan.okul.Responses.PersonResponse;
import com.alkan.okul.entities.Person;
import com.alkan.okul.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("people/")
public class PersonController {

    @Autowired
    PersonService service;

    @PostMapping
    public PersonResponse register(@RequestBody PersonDto person){
        return service.register(person);
    }


}
