package com.alkan.okul.services;

import com.alkan.okul.entities.Classroom;
import com.alkan.okul.repos.ClassroomRepository;
import com.alkan.okul.responses.DTOs.ClassroomDto;
import com.alkan.okul.responses.ClassroomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassroomService {
    
    @Autowired
    ClassroomRepository repository;

    public ClassroomDto toDto(Classroom classroom){
        ClassroomDto dto = new ClassroomDto();
        dto.id = classroom.getId();
        dto.name = classroom.getName();
        return dto;
    }
    public Classroom fromDto(Classroom classroom,ClassroomDto dto){
        if (classroom == null){
            classroom = new Classroom();
        }
        classroom.setId(dto.id);
        classroom.setName(dto.name);
        classroom = repository.save(classroom);
        return classroom;
    }

    public ClassroomResponse add(ClassroomDto dto){
        Classroom classroom = fromDto(null,dto);
        ClassroomResponse response = new ClassroomResponse();
        response.classroomDto = toDto(classroom);
        return response;
    }

    public List<ClassroomDto> classroomDtos(List<Classroom> classrooms){
        List<ClassroomDto> classroomDtos = new ArrayList<>();
        for (Classroom classroom: classrooms){
            classroomDtos.add(toDto(classroom));
        }
        return classroomDtos;
    }


    public List<ClassroomDto> list() {
        List<Classroom> list = repository.findAll();
        return classroomDtos(list);
    }

    public ClassroomResponse find(int id) {
        ClassroomResponse response = new ClassroomResponse();
        response.classroomDto = toDto(repository.findById(id).get());
        return response;
    }


    public ClassroomResponse update(ClassroomDto dto) {

        Classroom classroom = repository.findClassroomById(dto.id);
        classroom = fromDto(classroom,dto);
        classroom = repository.save(classroom);
        ClassroomResponse response = new ClassroomResponse();
        response.classroomDto = toDto(classroom);
        return response;

    }

    public String delete(int id) {
        Classroom classroom = repository.getReferenceById(id);
        repository.delete(classroom);
        return "Classroom deleted";
    }
    
}
