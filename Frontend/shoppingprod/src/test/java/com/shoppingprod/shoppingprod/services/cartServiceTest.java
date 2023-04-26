//package com.shoppingprod.shoppingprod.services;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.shoppingprod.shoppingprod.entities.cart;
//import com.shoppingprod.shoppingprod.repository.CartItemsRepository;
//
//
//@SpringBootTest
//class cartServiceTest {
//	
//	@Autowired
//	private cartService cartService;
//	
//	@MockBean
//	CartItemsRepository cartRepo;
//	
//	private cart cartone;
//	private cart carttwo;
//	List<cart> cartlist;

//	@BeforeEach
//	public void setUp() {
//		cartlist = new ArrayList<>();
//		
//		cartone = new cart();
//		cartone.setId(23);
//		cartone.setTitle("abc");
//		cartone.setCost("");
//		cartone.setQuantity(2);
//		cartone.setStatus("Status");
//		
//		carttwo = new cart();
//		
//		carttwo.setId(23);
//		carttwo.setTitle("abc");
//		carttwo.setCost("");
//		carttwo.setQuantity(4);
//		carttwo.setStatus("Status");
//		
//		cartlist.add(cartone);
//		cartlist.add(carttwo);
//		
//		
//	}

//}
