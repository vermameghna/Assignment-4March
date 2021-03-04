package com.demo.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer did;
	private String dname;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee>employees=new ArrayList<>();
	
	public Department(Integer did, String dname, List<Employee> employees) {
		this.did = did;
		this.dname = dname;
		this.employees = employees;
	}

	public Department(String dname, List<Employee> employees) {
		this.dname = dname;
		this.employees = employees;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department() {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [did=").append(did).append(", dname=").append(dname).append(", employees=")
				.append(employees).append("]");
		return builder.toString();
	}
	
}















