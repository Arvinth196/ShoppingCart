package com.shoppingprod.shoppingprod.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.boot.test.context.SpringBootTest;

import com.shoppingprod.shoppingprod.entities.cart;
import com.shoppingprod.shoppingprod.repository.CartItemsRepository;
import com.shoppingprod.shoppingprod.repository.productRepository;

@SpringBootTest
@MockitoSettings(strictness=Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
class cartServiceImplTest {
	
	@InjectMocks
	private cartServiceImpl cartServiceImpl;
	
	@Mock
	private CartItemsRepository cartRepo;
	
	@Mock
	private productRepository productRepo;
	
	@Test
	void test() {
		assertNotNull(cartServiceImpl);
	}
	
	@Test
    public void updateproductsTest(){
         MockitoAnnotations.initMocks(this);
//         Optional<Cart> cart=Optional.empty();
        cart cart= new cart(1,1,"abc","cost",1,"subtotal","ACTIVE");
         
         Mockito.when(cartRepo.findById(1l)).thenReturn(cart);
         Mockito.when(cartRepo.save(cart)).thenReturn(cart);
         assertNotNull(cartServiceImpl.updateproducts(cart,1));
         
    }
	
	@Test
    public void deleteproductsTest(){
//         MockitoAnnotations.initMocks(this);
////         Optional<Cart> cart=Optional.empty();
         cart Cart= new cart(1,1,"abc","cost",1,"subtotal","ACTIVE");
//         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.delete(Cart)).thenReturn(Cart);
//         assertNotNull(cartServiceImpl.deleteproduct(1));
         
    }
	
//	@Test 
//    void checkout(){
//		when(cartRepo.findAllActive()).thenReturn(new ArrayList<>());
//		ArrayList<cart> cartlist = new ArrayList<>();
//		cart c = new cart(1,"abc","cost",1,"subtotal","ACTIVE");
//		cartlist.add(c);
//		when(cartServiceImpl.checkout(c)).thenReturn(cartlist);
//
//	}
	
	@Test
    public void deleteproductsTest1(){
//         MockitoAnnotations.initMocks(this);
////         Optional<Cart> cart=Optional.empty();
         cart Cart= new cart(2,2,"abc","cost",1,"subtotal","ACTIVE");
//         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.delete(Cart)).thenReturn(Cart);
//         assertNotNull(cartServiceImpl.deleteproduct(1));
         
    }
	
	@Test
    public void updateproductsTest3(){
         MockitoAnnotations.initMocks(this);
//         Optional<Cart> cart=Optional.empty();
        cart Cart= new cart(1,1,"abc","cost",2,"subtotal","ACTIVE");
         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.save(Cart)).thenReturn(Cart);
         assertNotNull(cartServiceImpl.updateproducts(Cart,1));
         
    }
	
	@Test
    public void updateproductsTest5(){
         MockitoAnnotations.initMocks(this);
//         Optional<Cart> cart=Optional.empty();
        cart Cart= new cart(1,1,"abc","cost",3,"subtotal","ACTIVE");
         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.save(Cart)).thenReturn(Cart);
         assertNotNull(cartServiceImpl.updateproducts(Cart,1));
         
    }
	
	@Test
    public void updateproductsTest1(){
         MockitoAnnotations.initMocks(this);
//         Optional<Cart> cart=Optional.empty();
        cart Cart= new cart(1,1,"abc","cost",4,"subtotal","ACTIVE");
         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.save(Cart)).thenReturn(Cart);
         assertNotNull(cartServiceImpl.updateproducts(Cart,1));
         
    }
	
	@Test
    public void updateproductsTest2(){
         MockitoAnnotations.initMocks(this);
//         Optional<Cart> cart=Optional.empty();
        cart Cart= new cart(1,1,"abc","cost",5,"subtotal","ACTIVE");
         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.save(Cart)).thenReturn(Cart);
         assertNotNull(cartServiceImpl.updateproducts(Cart,1));
         
    }
	
	@Test
    public void updateproductsTest6(){
         MockitoAnnotations.initMocks(this);
//         Optional<Cart> cart=Optional.empty();
        cart Cart= new cart(1,1,"abc","cost",0,"subtotal","ACTIVE");
         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.save(Cart)).thenReturn(Cart);
         assertNotNull(cartServiceImpl.updateproducts(Cart,1));
         
    }
	
	@Test
    public void updateproductsTest7(){
         MockitoAnnotations.initMocks(this);
//         Optional<Cart> cart=Optional.empty();
        cart Cart= new cart(1,2,"abc","cost",0,"subtotal","ACTIVE");
         
         Mockito.when(cartRepo.findById(1l)).thenReturn(Cart);
         Mockito.when(cartRepo.save(Cart)).thenReturn(Cart);
         assertNotNull(cartServiceImpl.updateproducts(Cart,1));
         
    }
	

}
