package com.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.dao.Department;
import com.demo.model.dao.Employee;
import com.demo.model.dao.Project;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		
		
//		Project p1 = new Project("ABC", new Date(), "Meghna");
//		List<Project> projects = new ArrayList<Project>();
//		projects.add(p1);
//		
//		
//		Department d1 = new Department("IT", employees2);
//		Employee e1 = new Employee("Meghna", 500000, d1, projects);
//        Employee e2 = new Employee("Keshav", 500000, projects);
//		List<Employee> employees1 = new ArrayList<Employee>();
//		employees1.add(e)
//		
//		Employee e1 = new Employee("Meghna", 500000, , projects)
//		List<Employee> employees = new ArrayList<Employee>();
////		Department department = new Department("IT", )
////		
//		
//		
		
		
		
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------");
		
	}
	
	

}
