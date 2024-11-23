package com.devsuperior.aulalazy.dto;

import java.io.Serializable;

import com.devsuperior.aulalazy.entities.Employee;

public class EmployeeDepartmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private DepartmentDTO department;
	
	public EmployeeDepartmentDTO() {
	}

	public EmployeeDepartmentDTO(Long id, String name, String email, DepartmentDTO department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}

	public EmployeeDepartmentDTO(Employee entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		department = new DepartmentDTO(entity.getDepartment());
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

}
