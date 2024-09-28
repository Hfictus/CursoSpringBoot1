package com.devsuperior.dsb3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsb3.dto.ClientDTO;
import com.devsuperior.dsb3.entities.Client;
import com.devsuperior.dsb3.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> result = repository.findById(id);
		Client client = result.get();
		ClientDTO dto = new ClientDTO(client);
		return dto;
	}/**ou:
	  *Client client = repository.findById(id).get();
	  * return new ClientDTO(client);
	  */
	
}
