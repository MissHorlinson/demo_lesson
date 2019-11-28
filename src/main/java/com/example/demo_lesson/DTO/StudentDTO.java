package com.example.demo_lesson.DTO;

import com.example.demo_lesson.model.Student;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentDTO {

    @JsonProperty("name")
    private String name;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("university")
    private String university;
    @JsonProperty("course")
    private String course;
    @JsonProperty("group")
    private Integer group;

    public StudentDTO() {

    }

    public StudentDTO(String name, String surname, String university, String course) {
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.course = course;
    }

    public StudentDTO(String name, String surname, String university, String course, Integer group) {
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUniversity() {
        return university;
    }

    public String getCourse() {
        return course;
    }
}
