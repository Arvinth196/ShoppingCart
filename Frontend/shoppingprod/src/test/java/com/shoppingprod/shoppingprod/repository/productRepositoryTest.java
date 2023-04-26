package com.shoppingprod.shoppingprod.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shoppingprod.shoppingprod.entities.product;


@SpringBootTest
class productRepositoryTest {
	
	@Autowired
	productRepository prod;
	
	
	@Test
	public void test() throws Exception {
		product prods = new product();
				prods.setTitle("Title");
				prods.setDescription("Description");
				prods.setImageurl("Imageurl");
				prods.setCost("Cost");
				prods.setQuantity("Quantity");
		
		
//		assertEquals("abc", prods.getTitle());
//        assertEquals(2,prods.getId());
//        assertEquals("abc",prods.getDescription());
//        assertEquals("cost",prods.getCost());
//        assertEquals("string",prods.getImageurl());
//        assertEquals("cost",prods.getQuantity());
	}
	
	@Test
	public void testt (){
		long id = 1;
		product p = new product();
		p.setId(1);
		assertEquals(1,p.getId());
	}
	
	@Test
	public void testtt() {
		product p = new product("Tit","Desc","Cost","img","Quan");
//		assertTrue(p.getTitle().equals("Titl"));
//		assertTrue(p.getDescription().equals("Desc"));
//		assertTrue(p.getCost().equals("Cost"));
//		assertTrue(p.getImageurl().equals("img"));
//		assertTrue(p.getQuantity().equals("Quan"));
//		assertNotNull(p);


		
	}
}
