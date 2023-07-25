package com.alkan.okul.responses.DTOs;

import java.io.Serializable;

public class PersonDto implements Serializable {

    public int id;
    public String name;
    public String surname;
    public String job;

    public PersonDto() {
    }

    public PersonDto(int id, String name, String surname, String job) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
