package com.alkan.okul.controller;

import com.alkan.okul.responses.SubjectDto;
import com.alkan.okul.responses.SubjectResponse;
import com.alkan.okul.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    
    @Autowired
    SubjectService service;

    @PostMapping
    public SubjectResponse register(@RequestBody SubjectDto subjectDto){
        return service.register(subjectDto);
    }

    @GetMapping("/list")
    public List<SubjectDto> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public SubjectResponse find(@PathVariable(value = "id") int id){
        return service.find(id);
    }

    @PutMapping
    public SubjectResponse update(SubjectDto dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(value = "id") int id){
        return service.delete(id);
    }
    
}
