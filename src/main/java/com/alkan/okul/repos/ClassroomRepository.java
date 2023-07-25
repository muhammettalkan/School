package com.alkan.okul.repos;

import com.alkan.okul.entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom,Integer> {

    Classroom findClassroomById(int id);

}
