package com.alkan.okul.controller;

import com.alkan.okul.responses.DTOs.ClassroomDto;
import com.alkan.okul.responses.ClassroomResponse;
import com.alkan.okul.services.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classrooms")
public class ClassroomController {

    @Autowired
    ClassroomService service;

    @PostMapping
    public ClassroomResponse add(@RequestBody ClassroomDto classroomDto){
        return service.add(classroomDto);
    }

    @GetMapping("/list")
    public List<ClassroomDto> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public ClassroomResponse find(@PathVariable(value = "id") int id){
        return service.find(id);
    }

    @PutMapping
    public ClassroomResponse update(ClassroomDto dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") int id){
        return service.delete(id);
    }
    
}
