package com.shoppingprod.shoppingprod;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoppingprodApplicationTests {

	@Mock
	ShoppingprodApplication prodcartapp;
	
	@Test
	void contextLoads() {
		assertNotNull(prodcartapp);
	}

}
