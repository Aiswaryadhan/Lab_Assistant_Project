package com.gec.lab_admin.services;

import com.gec.lab_admin.db.models.Student;
import com.gec.lab_admin.db.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> login(String studentId) {
        return studentRepository.findById(studentId);
    }
}
