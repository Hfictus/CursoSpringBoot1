package com.devsuperior.dsb3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsb3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
	boolean existsByCpf(String cpf);
	
}
