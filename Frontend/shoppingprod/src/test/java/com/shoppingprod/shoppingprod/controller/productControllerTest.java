package com.shoppingprod.shoppingprod.controller;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

//package com.shoppingprod.shoppingprod.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.when;
//
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.List;
//
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shoppingprod.shoppingprod.entities.cart;
import com.shoppingprod.shoppingprod.entities.product;
import com.shoppingprod.shoppingprod.repository.CartItemsRepository;
import com.shoppingprod.shoppingprod.repository.productRepository;
import com.shoppingprod.shoppingprod.services.JwtUtil;
import com.shoppingprod.shoppingprod.services.cartServiceImpl;
import com.shoppingprod.shoppingprod.services.productService;



public class productControllerTest {



	   @Mock
	    productService productService;
	    
	    @Mock
	    CartItemsRepository cartRepository;
	    
	    @Mock
	    productController productcontroller;
	    
	    @Mock
	    productRepository productDao;
	    
	    @Mock
	    JwtUtil jwtutil;
	    
	    @Mock
	    cartServiceImpl cartservice;
	    
//	    @Test
//	    public void getproductsTest() throws IOException{
//
//
//
//	       MockitoAnnotations.initMocks(this);
//	        when(jwtutil.validateToken("token")).thenReturn(false);
////	        ResponseEntity<?> validate = productcontroller.getValidate("bearer token");
////	        assertEquals( true, validate.getBody().toString().contains("false"));
//	    }
	    
	    



	   @Test
	    public void getproduct(){
	        equals(null);
	    }
	    
	    @Test
	    public void Test1(){
	        MockitoAnnotations.initMocks(this);
	        when(jwtutil.validateToken("token")).thenReturn(false);
	        equals(null);
	    }
	//
	    @Test
	    public void Test2(){
	        MockitoAnnotations.initMocks(this);
	        when(jwtutil.validateToken("token")).thenReturn(true);
	        when(jwtutil.extractUsername("token")).thenReturn("admin");
	        equals(null);
	        
	    }
	    
	    @Test
	    public void Test3(){
	        MockitoAnnotations.initMocks(this);
	        when(jwtutil.validateToken("token")).thenReturn(true);
	        when(jwtutil.extractUsername("token")).thenReturn("admin");
	        equals(null);
	        
	    }
	    
	    @Test
	   public  void getproductTest() {
	        MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	       
	       
	        List<product> productlist=new ArrayList<>();
	        product product1=new product("ad", "ad","ad","ad","ad");
	        productlist.add(product1);
	       
	        Mockito.when(this.productService.getAllProducts()).thenReturn(productlist);
//	        List<Product> response=productcontroller.getproducts(Token);
//	        Assertions.assertEquals(productlist,response);
	     
	    }
	    
	    
	    @Test
	    public void updateproductsTest(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,1,"abc","cost",1,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    
	    @Test
	    public void updateproductsTest1(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,1,"abc","cost",2,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    @Test
	    public void updateproductsTest2(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,1,"abc","cost",3,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    @Test
	    public void updateproductsTest3(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,1,"abc","cost",4,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    @Test
	    public void updateproductsTest4(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,1,"abc","cost",5,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    @Test
	    public void updateproductsTest5(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,1,"abc","cost",0,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    @Test
	    public void updateproductsTest6(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,2,"abc","cost",2,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    
	    @Test
	    public void updateproductsTest7(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,2,"abc","cost",3,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    @Test
	    public void updateproductsTest8(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,2,"abc","cost",4,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }
	    
	    @Test
	    public void updateproductsTest9(){
	         MockitoAnnotations.initMocks(this);
	         String Token="jwttoken1";
	         String token=Token.substring(7);
	         Mockito.when(jwtutil.validateToken(token)).thenReturn(true);
	         cart Cart= new cart(1,2,"abc","cost",5,"subtotal","ACTIVE");
	         
	         Mockito.when(this.cartservice.updateproducts(Cart,1)).thenReturn(Cart);
	         equals(null);
////	         Mockito.when(cartRepository.save(cart)).thenReturn(cart);
//	         Assertions.assertEquals(ProductController.updateproducts(cart, null));
	             }




	}
