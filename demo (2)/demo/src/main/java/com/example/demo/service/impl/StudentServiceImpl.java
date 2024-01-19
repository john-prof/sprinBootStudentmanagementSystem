package com.example.demo.service.impl;

import com.example.demo.entity.Students;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository repository;
    public StudentServiceImpl(StudentRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public List<Students> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Students saveStudent(Students student) {
        return repository.save(student);
    }

    @Override
    public Students getStudentById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Students updateStudent(Students student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }
}
