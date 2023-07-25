package com.alkan.okul.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Student extends Person{

    private long schoolNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private Classroom classroom;

    public Student() {
    }

    public Student(long schoolNumber, Classroom classroom) {
        this.schoolNumber = schoolNumber;
        this.classroom = classroom;
    }

    public Student(int id, String name, String surname, long schoolNumber, Classroom classroom) {
        super(id, name, surname);
        this.schoolNumber = schoolNumber;
        this.classroom = classroom;
    }

    public long getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(long schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
