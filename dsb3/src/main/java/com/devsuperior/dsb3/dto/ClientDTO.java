package com.devsuperior.dsb3.dto;

import java.time.LocalDate;

import com.devsuperior.dsb3.entities.Client;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;

public class ClientDTO {
	
	private Long id;
	
	@NotBlank(message = "Campo requerido")
	private String name;
	
	@NotBlank(message = "Campo requerido")
	@Pattern(regexp = "\\d{11}", message = "Requer sequência de 11 dígitos contínuos")
	private String cpf;
	private Double income;
	
	@PastOrPresent(message = "Requer data passada")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	private Integer children;
	
	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
			
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCpf() {
		return cpf;
	}
		
	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
				
}
