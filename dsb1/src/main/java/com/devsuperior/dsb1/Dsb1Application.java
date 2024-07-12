package com.devsuperior.dsb1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;

@ComponentScan({"com.devsuperior"})
@SpringBootApplication
public class Dsb1Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
		
	public static void main(String[] args) {
		SpringApplication.run(Dsb1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer code = sc.nextInt();
		Double basic = sc.nextDouble();
		Double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		System.out.println(
			"Pedido código " + order.getCode() +
			"\nValor total: R$ " +
			String.format("%.2f", orderService.total(order))
		);
		sc.close();
	}
	
	
	
	
}
