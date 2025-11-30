package com.VVD.StudentInfoDb.Services;

import com.VVD.StudentInfoDb.Entities.StudentEntity;
import com.VVD.StudentInfoDb.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public StudentEntity addStudent(StudentEntity stu){
        return repo.save(stu);
    }
    public List<StudentEntity> getAllStudentsInfo(){
        return repo.findAll();
    }
    public StudentEntity getByID(Integer roll){
        return repo.findById(roll).orElse(null);
    }
    public StudentEntity updateStudent(Integer roll,StudentEntity s){
        StudentEntity existing = repo.findById(roll).orElse(null);

        if (existing !=null){
            existing.setName(s.getName());
            existing.setEmail(s.getEmail());
            existing.setContact(s.getContact());
            return repo.save(existing);
        }
        return null;
    }
    public String deleteStudent(Integer roll) {
        repo.deleteById(roll);
        return "Student deleted successfully!";
    }
}
