package com.alkan.okul.repos;

import com.alkan.okul.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {

    School findSchoolById(int id);

}
