package com.cognizant.jpa_hibernate_comparsion.repository;

import com.cognizant.jpa_hibernate_comparsion.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
