package com.alkan.okul.responses.DTOs;


import java.io.Serializable;

public class StudentDto extends PersonDto implements Serializable {

    public long studentNumber;

    public ClassroomDto classroomDto;

    public StudentDto() {
    }

    public StudentDto(long studentNumber, ClassroomDto classroomDto) {
        this.studentNumber = studentNumber;
        this.classroomDto = classroomDto;
    }

    public StudentDto(int id, String name, String surname, String job, long studentNumber, ClassroomDto classroomDto) {
        super(id, name, surname, job);
        this.studentNumber = studentNumber;
        this.classroomDto = classroomDto;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public ClassroomDto getClassroomDto() {
        return classroomDto;
    }

    public void setClassroomDto(ClassroomDto classroomDto) {
        this.classroomDto = classroomDto;
    }
}
