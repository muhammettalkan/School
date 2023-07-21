package com.alkan.okul.controller;

import com.alkan.okul.responses.TeacherDto;
import com.alkan.okul.responses.TeacherResponse;
import com.alkan.okul.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teachers/")
public class TeacherController {

    @Autowired
    TeacherService service;

    @PostMapping
    public TeacherResponse register(@RequestBody TeacherDto teacherDto){
        return service.register(teacherDto);
    }

    @GetMapping("list")
    public List<TeacherDto> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public TeacherResponse find(@PathVariable(value = "id") int id){
        return service.find(id);
    }

    @PutMapping
    public TeacherResponse update(TeacherDto dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") int id){
        return service.delete(id);
    }



}