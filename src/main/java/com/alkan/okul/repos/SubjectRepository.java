package com.alkan.okul.repos;
import com.alkan.okul.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Integer> {

    Subject findSubjectById(int id);

}
