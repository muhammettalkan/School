package com.alkan.okul.services;

import com.alkan.okul.repos.StudentRepository;
import com.alkan.okul.responses.StudentDto;
import com.alkan.okul.responses.StudentResponse;
import com.alkan.okul.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public StudentDto toDto(Student student){
        StudentDto dto = new StudentDto();
        dto.id = student.getId();
        dto.name = student.getName();
        dto.surname = student.getSurname();
        return dto;
    }
    public Student fromDto(Student student,StudentDto dto){
        if (student == null){
            student = new Student();
        }
        student.setId(dto.id);
        student.setName(dto.name);
        student.setSurname(dto.surname);
        student = repository.save(student);
        return student;
    }

    public StudentResponse register(StudentDto dto){
        Student student = fromDto(null,dto);
        StudentResponse response = new StudentResponse();
        response.student = toDto(student);
        return response;
    }

    public List<StudentDto> studentDtos(List<Student> students){
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student: students){
            studentDtos.add(toDto(student));
        }
        return studentDtos;
    }


    public List<StudentDto> list() {
        List<Student> list = repository.findAll();
        return studentDtos(list);
    }

    public StudentResponse find(int id) {
        StudentResponse response = new StudentResponse();
        response.student = toDto(repository.findById(id).get());
        return response;
    }


    public StudentResponse update(StudentDto dto) {

        Student student = repository.findStudentById(dto.id);
        student = fromDto(student,dto);
        student = repository.save(student);
        StudentResponse response = new StudentResponse();
        response.student = toDto(student);
        return response;

    }

    public String delete(int id) {
        Student student = repository.getReferenceById(id);
        repository.delete(student);
        return "Student deleted";
    }
}
