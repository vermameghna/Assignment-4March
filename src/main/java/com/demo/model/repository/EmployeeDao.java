package com.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.dao.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
}
