package com.devsuperior.aula.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.aula.dto.ProductDTO;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	/*A ser feito após criação de ProductService:
	 * @Autowired
	 * private ProductService service;
	 */
	
	//@PostMapping
	public ResponseEntity<ProductDTO> insert(@RequestBody ProductDTO dto) {
		/*A ser feito após criar ProductService:
		 * dto = service.insert(dto);
		 */
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(dto);
	}
	

}