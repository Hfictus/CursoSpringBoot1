package com.devsuperior.dsb3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsb3.dto.ClientDTO;
import com.devsuperior.dsb3.entities.Client;
import com.devsuperior.dsb3.repositories.ClientRepository;
import com.devsuperior.dsb3.services.exceptions.DatabaseException;
import com.devsuperior.dsb3.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client = repository.findById(id).orElseThrow(
					    () -> new ResourceNotFoundException("Recurso não encontrado."));
		return new ClientDTO(client);
	}
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable) {
		Page<Client> result = repository.findAll(pageable);
		return result.map(x -> new ClientDTO(x));
	}

	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		if(repository.existsByCpf(dto.getCpf())) {
			throw new DatabaseException("CPF já cadastrado");
		}
		Client entity = new Client();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		try {
			Client entity = repository.getReferenceById(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new ClientDTO(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Recurso não encontrado");
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException("Incompatibilidade entre id e cpf");
		}
	}
	
	@Transactional
	public void delete(Long id) {
		if(!repository.existsById(id)) {
			throw new ResourceNotFoundException("Recurso não encontrado");
		}
		repository.deleteById(id);
	}
	
	
	private void copyDtoToEntity(ClientDTO dto, Client entity) {
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
	}
}