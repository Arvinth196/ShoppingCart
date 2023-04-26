package com.shoppingprod.shoppingprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingprodApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingprodApplication.class, args);
	}

}
