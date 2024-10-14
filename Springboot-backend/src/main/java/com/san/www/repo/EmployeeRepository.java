package com.san.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.www.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{

}
