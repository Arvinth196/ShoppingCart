package com.shoppingprod.shoppingprod.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shoppingprod.shoppingprod.entities.product;
import com.shoppingprod.shoppingprod.repository.productRepository;

@SpringBootTest
class productServiceTest {
	
	
	@MockBean
	private productRepository productRepo;
	
	@Autowired
	private productService productService;
	
	
	@Test
	public void test() {
		when(productRepo.findAll()).thenReturn(Stream
				.of(new product("Titl","Desc","imag","cost","quan")).collect(Collectors.toList()));
		assertEquals(1, productService.getAllProducts().size());
		
		
		assertNotNull(productService);
		assertNotNull(productRepo);
	}

}
