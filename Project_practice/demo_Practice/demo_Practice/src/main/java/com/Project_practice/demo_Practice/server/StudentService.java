package com.Project_practice.demo_Practice.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project_practice.demo_Practice.model.Student;
import com.Project_practice.demo_Practice.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student updateAllDetailStudent(int id, Student student) {

        Student exists = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        exists.setName(student.getName());
        exists.setEmail(student.getEmail());
        exists.setRollno(student.getRollno());
        exists.setGender(student.getGender());
        exists.setCourse(student.getCourse());
        exists.setAge(student.getAge());
        exists.setEnroll(student.isEnroll());

        return studentRepository.save(exists);
    }
}

