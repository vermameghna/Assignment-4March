package com.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.dao.Department;
import com.demo.model.dao.Employee;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{
}
