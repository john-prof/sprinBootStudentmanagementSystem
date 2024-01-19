package com.example.demo.service;

import com.example.demo.entity.Students;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Students> getAllStudents();
    Students saveStudent(Students student);
    Students getStudentById(Integer id);
    Students updateStudent(Students student);
    void deleteStudentById(Integer id);
}
