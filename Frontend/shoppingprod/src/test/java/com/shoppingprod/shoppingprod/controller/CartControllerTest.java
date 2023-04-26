//package com.shoppingprod.shoppingprod.controller;
//
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.when;
//
//import java.text.ParseException;
//import java.util.List;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.shoppingprod.shoppingprod.entities.cart;
//import com.shoppingprod.shoppingprod.services.JwtUtil;
//import com.shoppingprod.shoppingprod.services.cartService;
//
//
//
//public class CartControllerTest {
//	
//	@InjectMocks
//	CartContoller CartCon;
//	
//	
//	@MockBean
//	cartService CartService;
//	
//	
//	private cart Cart;
//	
//	@MockBean
//	JwtUtil jwtUtil;
//	
//	
//	@BeforeEach
//	void setUp() throws ParseException {
//		Cart = new cart();
//		Cart.setId(23);
//		Cart.setTitle("Title");
//		Cart.setCost("Cost");
//		Cart.setQuantity(4);
//		Cart.setSubtotal("Status");
//		Cart.setStatus("cartId");
//	}
//	
//	@AfterEach
//	public void down() {
//		Cart = null;
//	}
//
//}
