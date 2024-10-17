package com.devsuperior.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aula.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
