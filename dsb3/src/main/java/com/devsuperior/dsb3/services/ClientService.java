package com.devsuperior.dsb3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsb3.dto.ClientDTO;
import com.devsuperior.dsb3.entities.Client;
import com.devsuperior.dsb3.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public ClientDTO findById(Long id) {
		Optional<Client> result = repository.findById(id);
		Client client = result.get();
		return null;
	}
	
}
