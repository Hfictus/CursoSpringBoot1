package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {//componente
		
	public double discount(double amount) {
		return amount * 0.1;//cálculo de desconto da previdência
	}
}
