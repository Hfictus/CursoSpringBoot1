package com.devsuperior.aulalazy.dto;

import java.io.Serializable;

import com.devsuperior.aulalazy.entities.Employee;

public class EmployeeMinDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	
	public EmployeeMinDTO() {
	}

	public EmployeeMinDTO(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public EmployeeMinDTO(Employee entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
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

}
