package com.alkan.okul.responses;

import java.io.Serializable;

public class StudentDto extends PersonDto implements Serializable {

    public long studentNumber;

    public StudentDto() {
    }

    public StudentDto(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public StudentDto(int id, String name, String surname, String job, long studentNumber) {
        super(id, name, surname, job);
        this.studentNumber = studentNumber;
    }
}
