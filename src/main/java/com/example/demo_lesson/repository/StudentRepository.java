package com.example.demo_lesson.repository;

import com.example.demo_lesson.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Long> {
}
