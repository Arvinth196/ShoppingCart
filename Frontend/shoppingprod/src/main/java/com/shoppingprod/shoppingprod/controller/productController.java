package com.shoppingprod.shoppingprod.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingprod.shoppingprod.entities.cart;
import com.shoppingprod.shoppingprod.entities.product;
import com.shoppingprod.shoppingprod.repository.productRepository;
import com.shoppingprod.shoppingprod.services.JwtUtil;
import com.shoppingprod.shoppingprod.services.productService;

@RestController
@RequestMapping("/products")
public class productController {
	
	@Autowired
	productRepository ProductRepository;
	
	@Autowired
	productService ProductService;
	
    @Autowired
	JwtUtil jwtutil;

	
	@GetMapping("/getAll")
	public List<product> getAllProducts(@RequestHeader(value = "Authorization") String authToken) {
//		String token = authToken.substring(7);
//	       if(jwtutil.validateToken(token)){  

	        return this.ProductService.getAllProducts();
	        
	}

//	    }
//	       return null;
//	   }
//	
	@PostMapping("/products/addToCart/{userId}")
	public ResponseEntity<product> addToCart(@PathVariable("userId") int userId,@RequestBody long id,@RequestHeader(value = "Authorization") String authToken) {
		
		String token = authToken.substring(7);
        if(jwtutil.validateToken(token)){ 
		
		Optional<product> productData = ProductService.addToCart(id,userId);
		
		if (productData!=null) {
			return new ResponseEntity<>(productData.get(), HttpStatus.OK);
		} else{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
		
	    }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
	
	
	
	
	
}
 



