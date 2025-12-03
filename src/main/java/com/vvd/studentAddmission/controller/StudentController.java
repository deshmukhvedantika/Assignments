package com.vvd.studentAddmission.controller;

import com.vvd.studentAddmission.model.Student;
import com.vvd.studentAddmission.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/")
    public String homepage() {
        return "Welcome to SGM, Karad";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student s) {
        service.addStudent(s);
    }

    @GetMapping("/students/{rollNo}")
    public Student getStudentByRollNo(@PathVariable Integer rollNo) {
        return service.getStudentByRollNo(rollNo);
    }
}
