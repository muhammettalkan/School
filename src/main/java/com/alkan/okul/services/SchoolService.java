package com.alkan.okul.services;

import com.alkan.okul.entities.School;
import com.alkan.okul.repos.SchoolRepository;
import com.alkan.okul.responses.DTOs.SchoolDto;
import com.alkan.okul.responses.SchoolResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {
    
    @Autowired
    SchoolRepository repository;

    public SchoolDto toDto(School school){
        SchoolDto dto = new SchoolDto();
        dto.id = school.getId();
        dto.name = school.getName();
        return dto;
    }
    public School fromDto(School school,SchoolDto dto){
        if (school == null){
            school = new School();
        }
        school.setId(dto.id);
        school.setName(dto.name);
        school = repository.save(school);
        return school;
    }

    public SchoolResponse register(SchoolDto dto){
        School school = fromDto(null,dto);
        SchoolResponse response = new SchoolResponse();
        response.schoolDto = toDto(school);
        return response;
    }

    public List<SchoolDto> schoolDtos(List<School> schools){
        List<SchoolDto> schoolDtos = new ArrayList<>();
        for (School school: schools){
            schoolDtos.add(toDto(school));
        }
        return schoolDtos;
    }


    public List<SchoolDto> list() {
        List<School> list = repository.findAll();
        return schoolDtos(list);
    }

    public SchoolResponse find(int id) {
        SchoolResponse response = new SchoolResponse();
        response.schoolDto = toDto(repository.findById(id).get());
        return response;
    }


    public SchoolResponse update(SchoolDto dto) {

        School school = repository.findSchoolById(dto.id);
        school = fromDto(school,dto);
        school = repository.save(school);
        SchoolResponse response = new SchoolResponse();
        response.schoolDto = toDto(school);
        return response;

    }

    public String delete(int id) {
        School school = repository.getReferenceById(id);
        repository.delete(school);
        return "School deleted";
    }
    
}
