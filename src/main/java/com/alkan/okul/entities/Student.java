package com.alkan.okul.entities;

import jakarta.persistence.Entity;

@Entity
public class Student extends Person{

    private long schoolNumber;

    public Student() {
    }

    public Student(long schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Student(int id, String name, String surname, String job, long schoolNumber) {
        super(id, name, surname);
        this.schoolNumber = schoolNumber;
    }

    public long getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(long schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
}
