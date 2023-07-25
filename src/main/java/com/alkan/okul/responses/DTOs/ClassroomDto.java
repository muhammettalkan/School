package com.alkan.okul.responses.DTOs;

public class ClassroomDto {

    public int id;
    public String name;

    public ClassroomDto() {
    }

    public ClassroomDto(int id, String name) {
        this.id = id;
        this.name = name;
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
}
