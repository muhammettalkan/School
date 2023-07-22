package com.alkan.okul.entities;

import jakarta.persistence.Entity;

@Entity
public class Employee extends Person{

    private double salary;
    private String title;

}
