package com.example.demo_lesson.model;

import com.example.demo_lesson.DTO.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "university")
    private String university;
    @Column(name = "course")
    private String course;

    public Student() {}

    public Student(StudentDTO studentDTO) {
        this.name = studentDTO.getName();
        this.surname = studentDTO.getSurname();
        this.course = studentDTO.getCourse();
        this.university = studentDTO.getUniversity();
    }

    public Student(String name, String surname, String university, String course) {
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.course = course;
    }
}

