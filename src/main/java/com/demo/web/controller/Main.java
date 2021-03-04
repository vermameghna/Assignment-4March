package com.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.dao.Employee;
import com.demo.model.service.DepartmentService;

@RestController
public class Main {
	
	
	private DepartmentService departmentService;

	@Autowired
	public Main(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return departmentService.getAllEmployees();
	}
	
	
}
