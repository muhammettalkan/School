package com.alkan.okul.services;

import com.alkan.okul.entities.Subject;
import com.alkan.okul.repos.SubjectRepository;
import com.alkan.okul.responses.SubjectDto;
import com.alkan.okul.responses.SubjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    
    @Autowired
    SubjectRepository repository;

    public SubjectDto toDto(Subject subject){
        SubjectDto dto = new SubjectDto();
        dto.id = subject.getId();
        dto.name = subject.getName();
        return dto;
    }
    public Subject fromDto(Subject subject,SubjectDto dto){
        if (subject == null){
            subject = new Subject();
        }
        subject.setId(dto.id);
        subject.setName(dto.name);
        subject = repository.save(subject);
        return subject;
    }

    public SubjectResponse register(SubjectDto dto){
        Subject subject = fromDto(null,dto);
        SubjectResponse response = new SubjectResponse();
        response.subjectDto = toDto(subject);
        return response;
    }

    public List<SubjectDto> subjectDtos(List<Subject> subjects){
        List<SubjectDto> subjectDtos = new ArrayList<>();
        for (Subject subject: subjects){
            subjectDtos.add(toDto(subject));
        }
        return subjectDtos;
    }


    public List<SubjectDto> list() {
        List<Subject> list = repository.findAll();
        return subjectDtos(list);
    }

    public SubjectResponse find(int id) {
        SubjectResponse response = new SubjectResponse();
        response.subjectDto = toDto(repository.findById(id).get());
        return response;
    }


    public SubjectResponse update(SubjectDto dto) {

        Subject subject = repository.findSubjectById(dto.id);
        subject = fromDto(subject,dto);
        subject = repository.save(subject);
        SubjectResponse response = new SubjectResponse();
        response.subjectDto = toDto(subject);
        return response;

    }

    public String delete(int id) {
        Subject subject = repository.getReferenceById(id);
        repository.delete(subject);
        return "Subject deleted";
    }
    
}
