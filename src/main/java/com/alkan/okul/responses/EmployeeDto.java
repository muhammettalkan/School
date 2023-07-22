package com.alkan.okul.responses;

public class EmployeeDto extends PersonDto{

    public double salary;

    public String title;

    public EmployeeDto() {
    }

    public EmployeeDto(double salary, String title) {
        this.salary = salary;
        this.title = title;
    }

    public EmployeeDto(int id, String name, String surname, String job, double salary, String title) {
        super(id, name, surname, job);
        this.salary = salary;
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
