package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {
	
	private Long id;
	private String name;
	private Double salary;
	
	private DepartmentDTO department;

	public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public PersonDepartmentDTO(Person entity) {
		this.id = entity.id;
		this.name = entity.name;
		this.salary = entity.salary;
		this.department = entity.department;
	}
	
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}
	
	
	
}
