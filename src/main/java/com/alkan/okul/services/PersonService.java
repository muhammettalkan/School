package com.alkan.okul.services;

import com.alkan.okul.responses.PersonDto;
import com.alkan.okul.responses.PersonResponse;
import com.alkan.okul.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public PersonDto toDto(Person person){
        PersonDto dto = new PersonDto();
        dto.id = person.getId();
        dto.name = person.getName();
        dto.surname = person.getSurname();
        dto.job = person.getJob();
        dto.salary = person.getSalary();
        return dto;
    }
    public Person fromDto(Person person,PersonDto dto){
        if (person == null){
            person = new Person();
        }
        person.setId(dto.id);
        person.setName(dto.name);
        person.setSurname(dto.surname);
        person.setJob(dto.job);
        person.setSalary(dto.salary);
        person = repository.save(person);
        return person;
    }

    public PersonResponse register(PersonDto dto){
        Person person = fromDto(null,dto);
        PersonResponse response = new PersonResponse();
        response.person = toDto(person);
        return response;
    }





}
