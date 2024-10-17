package com.devsuperior.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aula.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
