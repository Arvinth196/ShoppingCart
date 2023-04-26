package com.shoppingprod.shoppingprod.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shoppingprod.shoppingprod.entities.cart;

@Service
public interface cartService {
	
	
	public cart updateproducts(cart product,int userId);
    
    public void deleteproduct(int userId,long parseLong);
    public void checkout(cart Item,int userId);
    
    
//    public List<cart> updateStatus(long id);

//	public List<cart> getCartByUserId(int userid);


}
