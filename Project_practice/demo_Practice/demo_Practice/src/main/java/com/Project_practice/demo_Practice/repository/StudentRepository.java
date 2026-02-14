package com.Project_practice.demo_Practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project_practice.demo_Practice.model.Student;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    void deleteById(Integer id);

    boolean existsById(Integer id);

    List<Student> findByGender(String gender);

    

    List<Student> findByEnroll(boolean enroll );
    
   

    boolean existsByName( String name);
    Student findByName(String name);

    boolean existsByRollno(String rollno);
    Student findByRollno(String rollno);
    
    boolean existsByEmail(String email);
}
