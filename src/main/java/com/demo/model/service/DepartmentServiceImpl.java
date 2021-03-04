package com.demo.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.dao.Employee;
import com.demo.model.repository.DepartmentDao;
import com.demo.model.repository.EmployeeDao;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentDao departmentDao;
	private EmployeeDao employeeDao;
 
	@Autowired
	public DepartmentServiceImpl(DepartmentDao departmentDao,EmployeeDao employeeDao) {
		this.departmentDao = departmentDao;
		this.employeeDao = employeeDao;
	}



	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.findAll();
		return employees;
	}

}
