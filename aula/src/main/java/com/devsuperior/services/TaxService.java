package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {//componente. Serviço de imposto
		
	public double tax(double amount) {
		return amount * 0.2;//cálculo de desconto de imposto
	}
	
}
