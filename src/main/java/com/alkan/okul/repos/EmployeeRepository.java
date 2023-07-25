package com.alkan.okul.repos;

import com.alkan.okul.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findEmployeeById(int id);

}
