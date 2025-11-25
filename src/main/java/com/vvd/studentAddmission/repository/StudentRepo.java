package com.vvd.studentAddmission.repository;

import com.vvd.studentAddmission.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    List<Student> students = new ArrayList<>();

    public StudentRepo() {

        Student s = new Student(35, "Shweta");
        students.add(s);

        s = new Student(77, "Madhura");
        students.add(s);

        s = new Student(89, "Prachi");
        students.add(s);

        s = new Student(59, "Rutuja");
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public Student getStudentByRollNo(Integer rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                return s;
            }
        }
        return null;
    }
}
