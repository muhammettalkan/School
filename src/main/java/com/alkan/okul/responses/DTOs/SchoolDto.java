package com.alkan.okul.responses.DTOs;


import java.util.List;

public class SchoolDto {

    public int id;

    public String name;

    public List<StudentDto> listOfStudentDtos;

    public List<ClassroomDto> listOfClassroomDtos;

    public List<EmployeeDto> listOfEmployeeDtos;

    public SchoolDto() {
    }

    public SchoolDto(int id, String name, List<StudentDto> listOfStudentDtos, List<ClassroomDto> listOfClassroomDtos, List<EmployeeDto> listOfEmployeeDtos) {
        this.id = id;
        this.name = name;
        this.listOfStudentDtos = listOfStudentDtos;
        this.listOfClassroomDtos = listOfClassroomDtos;
        this.listOfEmployeeDtos = listOfEmployeeDtos;
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

    public List<StudentDto> getListOfStudentDtos() {
        return listOfStudentDtos;
    }

    public void setListOfStudentDtos(List<StudentDto> listOfStudentDtos) {
        this.listOfStudentDtos = listOfStudentDtos;
    }

    public List<ClassroomDto> getListOfClassroomDtos() {
        return listOfClassroomDtos;
    }

    public void setListOfClassroomDtos(List<ClassroomDto> listOfClassroomDtos) {
        this.listOfClassroomDtos = listOfClassroomDtos;
    }

    public List<EmployeeDto> getListOfEmployeeDtos() {
        return listOfEmployeeDtos;
    }

    public void setListOfEmployeeDtos(List<EmployeeDto> listOfEmployeeDtos) {
        this.listOfEmployeeDtos = listOfEmployeeDtos;
    }
}
