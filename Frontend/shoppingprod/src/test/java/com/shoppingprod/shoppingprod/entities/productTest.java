package com.shoppingprod.shoppingprod.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class productTest {
	
	product items = new product();
    product item = new product("ad", "ad","ad","ad","ad");
    
    @Test
    public void testid() {
        items.setId(1);
        assertEquals( 1, items.getId());
    }
    
    @Test
    public void testname() {
        items.setTitle("Title");
        assertEquals( "Title", items.getTitle());
    }



   @Test
    public void testimage() {
        items.setImageurl("Image");
        assertEquals( "Image", items.getImageurl());
    }



   @Test
    public void testprice() {
        items.setCost("cost");
        assertEquals( "cost", items.getCost());
    }

}
