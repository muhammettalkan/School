package com.alkan.okul.responses;

import java.io.Serializable;

public class TeacherDto extends PersonDto implements Serializable {

    public double salary;

    public TeacherDto() {
    }

    public TeacherDto(double salary) {
        this.salary = salary;
    }

    public TeacherDto(int id, String name, String surname, String job, double salary) {
        super(id, name, surname, job);
        this.salary = salary;
    }
}
