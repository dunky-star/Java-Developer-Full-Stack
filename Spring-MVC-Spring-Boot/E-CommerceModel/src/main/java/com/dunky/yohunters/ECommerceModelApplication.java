package com.dunky.yohunters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceModelApplication.class, args);
		
		Customer customer = new Customer(0, "default first name", "Default last name", "default@email" );
		customer.setId(1);
		customer.setFirstName("Kaligs");
		customer.setLastName("Dunky");
		customer.setEmail("dunky@mail.com");
		
		System.out.println("\n\nCustomer first name is: " + customer.getFirstName() + " \nCustomer last name is: " 
		+ customer.getLastName() + " \nCustomer email is: " + customer.getEmail());
	}

}
