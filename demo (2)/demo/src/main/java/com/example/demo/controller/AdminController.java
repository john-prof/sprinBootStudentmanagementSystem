package com.example.demo.controller;

import com.example.demo.DTO.StudentsDTO;
import com.example.demo.entity.Students;
import com.example.demo.service.StudentService;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class AdminController {
    @Autowired
    StudentService student;
    @GetMapping("/")
    public String showAdminDashboard(Model model){
        List<Students> students = student.getAllStudents();
        model.addAttribute("students",students);
        return "students";
    }
    @GetMapping("/students/edit/{id}")
    public String showEditPage(@PathVariable Integer id, Model model){
        model.addAttribute("student",student.getStudentById(id));
        return "edit_student";
    }
    @GetMapping("/students/new")
    public String showCreateNewStudent(Model model){
        Students student = new Students();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Integer id, @ModelAttribute("student") Students students, Model model){
        Students existingStudent = student.getStudentById(id);
        existingStudent.setFirstName(students.getFirstName());
        existingStudent.setLastName(students.getLastName());
        existingStudent.setEmail(students.getEmail());

        student.updateStudent(existingStudent);
        return "redirect:/";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Integer id){
        student.deleteStudentById(id);
        return "redirect:/";
    }
    @PostMapping("/students")
    public String saveStaff(@ModelAttribute("student") Students students){
        student.saveStudent(students);
        return "redirect:/";
    }
}
