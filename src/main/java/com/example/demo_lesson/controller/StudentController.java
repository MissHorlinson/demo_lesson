package com.example.demo_lesson.controller;

import com.example.demo_lesson.model.Student;
import com.example.demo_lesson.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get")
    public Student[] getStudents() {
        return studentService.getStudent();
    }
}
