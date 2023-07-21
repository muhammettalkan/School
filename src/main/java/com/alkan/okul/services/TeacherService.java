package com.alkan.okul.services;

import com.alkan.okul.repos.TeacherRepository;
import com.alkan.okul.responses.TeacherDto;
import com.alkan.okul.responses.TeacherResponse;
import com.alkan.okul.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository repository;

    public TeacherDto toDto(Teacher teacher){
        TeacherDto dto = new TeacherDto();
        dto.id = teacher.getId();
        dto.name = teacher.getName();
        dto.surname = teacher.getSurname();
        dto.job = teacher.getJob();
        return dto;
    }
    public Teacher fromDto(Teacher teacher,TeacherDto dto){
        if (teacher == null){
            teacher = new Teacher();
        }
        teacher.setId(dto.id);
        teacher.setName(dto.name);
        teacher.setSurname(dto.surname);
        teacher.setJob(dto.job);
        teacher = repository.save(teacher);
        return teacher;
    }

    public TeacherResponse register(TeacherDto dto){
        Teacher teacher = fromDto(null,dto);
        TeacherResponse response = new TeacherResponse();
        response.teacher = toDto(teacher);
        return response;
    }

    public List<TeacherDto> teacherDtos(List<Teacher> teachers){
        List<TeacherDto> teacherDtos = new ArrayList<>();
        for (Teacher teacher: teachers){
            teacherDtos.add(toDto(teacher));
        }
        return teacherDtos;
    }


    public List<TeacherDto> list() {
        List<Teacher> list = repository.findAll();
        return teacherDtos(list);
    }

    public TeacherResponse find(int id) {
        TeacherResponse response = new TeacherResponse();
        response.teacher = toDto(repository.findById(id).get());
        return response;
    }


    public TeacherResponse update(TeacherDto dto) {

        Teacher teacher = repository.findTeacherById(dto.id);
        teacher = fromDto(teacher,dto);
        teacher = repository.save(teacher);
        TeacherResponse response = new TeacherResponse();
        response.teacher = toDto(teacher);
        return response;

    }

    public String delete(int id) {
        Teacher teacher = repository.getReferenceById(id);
        repository.delete(teacher);
        return "Teacher deleted";
    }
}