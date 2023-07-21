package com.alkan.okul.responses;

import java.io.Serializable;

public class PersonDto implements Serializable {

    public int id;
    public String name;
    public String surname;
    public String job;
    public double salary;

    public PersonDto() {
    }

    public PersonDto(int id, String name, String surname, String job, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.salary = salary;
    }
}
