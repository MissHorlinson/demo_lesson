package com.example.demo_lesson.service;

import com.example.demo_lesson.DTO.StudentDTO;
import com.example.demo_lesson.model.Student;
import com.example.demo_lesson.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student[] getStudent() {
        RestTemplate restTemplate = new RestTemplate();
        String currencyResourceUrl = "https://api.monobank.ua/bank/currency";
        ResponseEntity<StudentDTO[]> response = restTemplate.getForEntity(currencyResourceUrl, StudentDTO[].class);
        StudentDTO[] studentDTOs = response.getBody();
        return createStudents(studentDTOs);
    }

    private Student[] createStudents (StudentDTO[] studentDTOs) {
        Student[] students = new Student[studentDTOs.length];
        for(int i = 0; i < studentDTOs.length; i++){
            students[i] = new Student(studentDTOs[i]);
            studentRepository.save(students[i]);
        }
        return students;
    }
}
