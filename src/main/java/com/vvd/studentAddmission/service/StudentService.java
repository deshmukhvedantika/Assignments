package com.vvd.studentAddmission.service;

import com.vvd.studentAddmission.model.Student;
import com.vvd.studentAddmission.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getStudents() {
        return repo.getStudents();
    }

    public void addStudent(Student s) {
        repo.addStudent(s);
    }

    public Student getStudentByRollNo(Integer rollNo) {
        return repo.getStudentByRollNo(rollNo);
    }
}
