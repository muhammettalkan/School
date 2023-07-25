package com.alkan.okul.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;


@Entity
public class Teacher extends Person{

    private double salary;

    @OneToOne(cascade = CascadeType.ALL)
    private Subject branch;

    public Teacher() {
    }

    public Teacher(double salary, Subject branch) {
        this.salary = salary;
        this.branch = branch;
    }

    public Teacher(int id, String name, String surname, double salary, Subject branch) {
        super(id, name, surname);
        this.salary = salary;
        this.branch = branch;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Subject getBranch() {
        return branch;
    }

    public void setBranch(Subject branch) {
        this.branch = branch;
    }
}
