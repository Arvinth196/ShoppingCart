package com.shoppingprod.shoppingprod.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingprod.shoppingprod.entities.CartStatus;
import com.shoppingprod.shoppingprod.entities.cart;
import com.shoppingprod.shoppingprod.entities.product;
import com.shoppingprod.shoppingprod.repository.CartItemsRepository;
import com.shoppingprod.shoppingprod.repository.productRepository;

@Service
public class productServiceImpl implements productService {
	
	@Autowired
	productRepository productrepository;
	
	@Autowired
	CartItemsRepository CartRepository;
	
	@Override
	public List<product> getAllProducts() {
		
		
		return productrepository.findAll();
	}
	
	public Optional<product> addToCart(long id,int userId) {
		Optional<product> productData = productrepository.findById(id);
		CartRepository.save(new cart(productData.get().getId(),userId, productData.get().getDescription(), productData.get().getCost(),1,productData.get().getQuantity(),CartStatus.ACTIVE.toString()));
		return productData; 
	}

	public Optional<product> getProductById(long id) {
		Optional<product> productData = productrepository.findById(id);
		return productData;
	}
	
	
	
	
	
	


}
