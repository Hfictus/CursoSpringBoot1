package com.devsuperior.entities;

public class Employee {//objeto de dados, ou objeto de domínio
	private String name;
	private Double grossSalary;
	
	public Employee() {};
	
	public Employee(String name, Double grossSalary) {
		this.name = name;
		this.grossSalary = grossSalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	
}
