package com.VVD.StudentInfoDb.Controllers;

import com.VVD.StudentInfoDb.Entities.StudentEntity;
import com.VVD.StudentInfoDb.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studb")
public class StudentController {

    @Autowired
    private StudentService ser;

    @PostMapping
    public StudentEntity addStudent(@RequestBody StudentEntity stu) {
        return ser.addStudent(stu);
    }

    @GetMapping
    public List<StudentEntity> getAllStudentsInfo(){
        return ser.getAllStudentsInfo();
    }

    @GetMapping("/{roll}")
    public StudentEntity getByID(@PathVariable Integer roll){
        return ser.getByID(roll);
    }

    @PutMapping("/{roll}")
    public StudentEntity updateStudent(@PathVariable Integer roll,@RequestBody StudentEntity s){
        return ser.updateStudent(roll,s);
    }

    @DeleteMapping("/{roll}")
    public String deleteStudent(@PathVariable Integer roll) {
        return ser.deleteStudent(roll);
    }
}