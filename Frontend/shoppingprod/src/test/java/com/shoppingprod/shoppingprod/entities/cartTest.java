package com.shoppingprod.shoppingprod.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class cartTest {
	
	private cart Cart;
	
	@BeforeEach
	void setUp() {
		Cart = new cart();
		Cart.setId(23);
		Cart.setDescription("Description");
		Cart.setCost("Cost");
		Cart.setQuantity(4);
		Cart.setSubtotal("Status");
		Cart.setStatus("cartId");
	}
	
	@Test
	public void test() {
		cart cartt = new cart(
				
				Cart.getId(),
				Cart.getUserId(),
				Cart.getDescription(),
				Cart.getCost(),
				Cart.getQuantity(),
				Cart.getSubtotal(),
				Cart.getStatus());
		
	
	
		assertEquals(cartt.getQuantity(),Cart.getQuantity());
		assertEquals(cartt.getId(),Cart.getId());
		assertEquals(cartt.getDescription(),Cart.getDescription());
		assertEquals(cartt.getCost(),Cart.getCost());
		assertEquals(cartt.getSubtotal(),Cart.getSubtotal());
		assertEquals(cartt.getStatus(),Cart.getStatus());

	}
}
