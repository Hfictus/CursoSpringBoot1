package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.PersonDTO;
import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	/*
	 * @Autowired
	 * private DepartmentRepository departmentRepository;
	 * para busca de dados de Department no DB com JPA
	 * para instanciar entidade ou objeto gerenciado pela JPA
	 * a JPA busca dados no DB se preciso 
	 */
	
	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		Department dept = new Department();
		dept.setId(dto.getDepartment().getId());
		entity.setDepartment(dept);
		
		entity = repository.save(entity);
		
		return new PersonDepartmentDTO(entity);
	}
	
	
	public PersonDTO insert(PersonDTO dto) {
		
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		
		//Department dept = departmentRepository.getReferenceById(dto.getDepartmentId());
		
		//objeto ou entidade transiente (dept): apenas salva id da entidade Department no DB
		Department dept = new Department();
		dept.setId(dto.getDepartmentId());
		
		entity.setDepartment(dept);
		
		entity = repository.save(entity);
				
		return new PersonDTO(entity);
	}
	
}
