package com.alkan.okul.responses;

import java.io.Serializable;

public class TeacherDto extends PersonDto implements Serializable{

    public double salary;

    public SubjectDto branch;

    public TeacherDto() {
    }

    public TeacherDto(double salary, SubjectDto branch) {
        this.salary = salary;
        this.branch = branch;
    }

    public TeacherDto(int id, String name, String surname, String job, double salary, SubjectDto branch) {
        super(id, name, surname, job);
        this.salary = salary;
        this.branch = branch;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SubjectDto getBranch() {
        return branch;
    }

    public void setBranch(SubjectDto branch) {
        this.branch = branch;
    }
}
