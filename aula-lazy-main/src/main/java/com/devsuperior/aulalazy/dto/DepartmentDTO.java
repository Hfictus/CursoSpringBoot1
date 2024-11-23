package com.devsuperior.aulalazy.dto;

import java.io.Serializable;

import com.devsuperior.aulalazy.entities.Department;

public class DepartmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
