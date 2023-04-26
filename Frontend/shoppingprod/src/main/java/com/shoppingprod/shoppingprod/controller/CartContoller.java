package com.shoppingprod.shoppingprod.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingprod.shoppingprod.entities.cart;
import com.shoppingprod.shoppingprod.repository.CartItemsRepository;
import com.shoppingprod.shoppingprod.services.JwtUtil;
import com.shoppingprod.shoppingprod.services.cartService;

@RestController
@RequestMapping("/cartitem")
public class CartContoller {
	
	@Autowired
	CartItemsRepository cartRepository;
	
	@Autowired
	cartService cartservice;
	
	@Autowired
	JwtUtil jwtutil;


	@GetMapping("/cart/{userId}")
	public ResponseEntity<List<cart>> getAllCartProds(@PathVariable("userId") int userId,@RequestParam(required = false) String product,@RequestHeader(value = "Authorization") String authToken) {
		
		String token = authToken.substring(7);
        if(jwtutil.validateToken(token)){
        try { 
            List<cart> cartList = new ArrayList<cart>();
           if (product == null) {
                List<cart> cartList1 = cartRepository.findAllItems(userId);

	             if (cartList1.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	           return new ResponseEntity<>(cartList1, HttpStatus.OK);
           }} catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
           }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build(); 
	}
	
	
	@DeleteMapping("/cart/{id}/{userId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("id") long id,@PathVariable("userId") int userId,@RequestHeader(value = "Authorization") String authToken) {
		
		String token = authToken.substring(7);
        if(jwtutil.validateToken(token)){
		
		try {
			cartservice.deleteproduct(userId,id);
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
      }
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}
	
	@PutMapping("/cartupdate/{userId}")
	public cart updateProduct(@PathVariable("userId") int userId,@RequestBody cart product,@RequestHeader(value = "Authorization") String authToken) {
		String token = authToken.substring(7);
        if(jwtutil.validateToken(token)) {
        	return this.cartservice.updateproducts(product,userId);
        	
		
	}
        return null;
    
	}
	
	
	@PostMapping("/cart/checkout/{userId}")
    public void checkout(@PathVariable("userId") int userId,@RequestBody cart Item,@RequestHeader(value = "Authorization") String authToken){
        String token = authToken.substring(7);
        if(jwtutil.validateToken(token)){
        cartservice.checkout(Item,userId);
        }
      
    }

}
