package com.alkan.okul.controller;

import com.alkan.okul.responses.DTOs.SchoolDto;
import com.alkan.okul.responses.SchoolResponse;
import com.alkan.okul.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {
    
    @Autowired
    SchoolService service;

    @PostMapping
    public SchoolResponse register(@RequestBody SchoolDto schoolDto){
        return service.register(schoolDto);
    }

    @GetMapping("/list")
    public List<SchoolDto> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public SchoolResponse find(@PathVariable(value = "id") int id){
        return service.find(id);
    }

    @PutMapping
    public SchoolResponse update(SchoolDto dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") int id){
        return service.delete(id);
    }
    
}
