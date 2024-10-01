package com.devsuperior.dsb3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.*;
/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
*/

import com.devsuperior.dsb3.dto.ClientDTO;
import com.devsuperior.dsb3.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
			
	@GetMapping(value = "/{id}")
	public ClientDTO findById(@PathVariable Long id) {
		ClientDTO dto = service.findById(id);
		return dto;
	}/**ou:
	  * return service.findById(id);
	  */
	
	@GetMapping
	public Page<ClientDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
		
	@PostMapping
	public ClientDTO insert(@RequestBody ClientDTO dto) {
		dto = service.insert(dto);
		return dto;
	}
	
	/**ou
	  *return service.insert(dto);
	  */
	
}
