package com.alkan.okul.entities;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> listOfStudents;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Classroom> listOfClassrooms;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> listOfEmployee;

    public School() {
    }

    public School(int id, String name, List<Student> listOfStudents, List<Classroom> listOfClassrooms, List<Employee> listOfEmployee) {
        this.id = id;
        this.name = name;
        this.listOfStudents = listOfStudents;
        this.listOfClassrooms = listOfClassrooms;
        this.listOfEmployee = listOfEmployee;
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

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public List<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(List<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(List<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }
}
