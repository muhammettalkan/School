package com.alkan.okul.repos;

import com.alkan.okul.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    Person findPersonById(int id);

}
