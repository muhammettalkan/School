package com.alkan.okul.repos;

import com.alkan.okul.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findStudentById(int id);


}
