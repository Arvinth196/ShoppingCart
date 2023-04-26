package com.shoppingprod.shoppingprod.services;

import java.util.List;
import java.util.Optional;

import com.shoppingprod.shoppingprod.entities.cart;
import com.shoppingprod.shoppingprod.entities.product;


public interface productService {
	
	public List<product> getAllProducts();

	Optional<product> addToCart(long id,int userId);

	
	
	Optional<product> getProductById(long id);
	
    

	
	
	



}
