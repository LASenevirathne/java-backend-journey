package com.Lakshika.studentapi.controller;

import com.Lakshika.studentapi.model.Student;
import com.Lakshika.studentapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return "Student added";
    }
}
