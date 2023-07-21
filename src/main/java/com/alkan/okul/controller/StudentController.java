package com.alkan.okul.controller;

import com.alkan.okul.responses.StudentDto;
import com.alkan.okul.responses.StudentResponse;
import com.alkan.okul.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students/")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping
    public StudentResponse register(@RequestBody StudentDto studentDto){
        return service.register(studentDto);
    }

    @GetMapping("list")
    public List<StudentDto> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public StudentResponse find(@PathVariable(value = "id") int id){
        return service.find(id);
    }

    @PutMapping
    public StudentResponse update(StudentDto dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") int id){
        return service.delete(id);
    }



}
