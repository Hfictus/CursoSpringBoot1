package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
		
	public double total(Order order) {
		return order.getBasic() * ((100 - order.getDiscount())/100) + shippingService.shipment(order);
	}
}
