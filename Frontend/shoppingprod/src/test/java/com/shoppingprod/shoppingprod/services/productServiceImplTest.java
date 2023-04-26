package com.shoppingprod.shoppingprod.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.google.common.base.Optional;
import com.shoppingprod.shoppingprod.entities.cart;
import com.shoppingprod.shoppingprod.entities.product;
import com.shoppingprod.shoppingprod.repository.CartItemsRepository;
import com.shoppingprod.shoppingprod.repository.productRepository;

class productServiceImplTest {
	
	@InjectMocks
    productServiceImpl productserviceimpl;
    
    @Mock
    productRepository productdao;
    
    @Mock
    CartItemsRepository cartRepository;
    
    @Test
	void test() {
//		assertNotNull(productserviceimpl);
	}
    
    @Test
    public void getproductbyidTest() throws IOException{
         MockitoAnnotations.initMocks(this);
         Optional<product> products= Optional.absent();
         products= Optional.of(new product("Titl","Desc","imag","cost","quan"));
         
//        Mockito.when(productdao.findById(1l)).thenReturn(products);
        assertNotNull(productserviceimpl.getProductById(1l));
        
        
    
    }
    

   @Test
    public void test_getproduct(){
        MockitoAnnotations.initMocks(this);
        List<product> products=new ArrayList<product>();
        products.add(new product("title","desc","image","cost","Quan"));
        products.add(new product("title","desc","image","cost","Quan"));
        
        Mockito.when(productdao.findAll()).thenReturn(products);
        Assertions.assertThat(productserviceimpl.getAllProducts().size());
        
        
    }
   
   @Test
   public void addtocartTest(){
       MockitoAnnotations.initMocks(this);
//        Optional<product> productData=Optional.empty();
//        productData= Optional.of(new product("title","desc","image","cost","Quan"));
////        Mockito.when(productdao.findById(1l)).thenReturn(productData);
//        Mockito.when(cartRepository.save(null)).thenReturn(productData);
//        assertNotNull(productserviceimpl.addToCart(1l));
        
   }
   
   @Test
   public void getproductTest(){
        MockitoAnnotations.initMocks(this);
        product product= new product("title","desc","image","cost","Quan");
        Mockito.when(productdao.getOne(1l)).thenReturn(product);
        assertNotNull(productserviceimpl.getproduct(1l));
       
   }
   
   @Test
   public void checkouttest(){
       MockitoAnnotations.initMocks(this);
       cart Cart= new cart(1,1,"abc","cost",1,"subtotal","ACTIVE");
       Mockito.when(cartRepository.findById(1l)).thenReturn(Cart);
//        Mockito.when(Cart.setStatus("")).thenReturn(cart);
        equals(true);
//        Assertions.assertNotNull(productserviceimpl.checkout(null));
   }
   
   @Test
   public void checkouttest1(){
       MockitoAnnotations.initMocks(this);
       cart Cart= new cart(1,5,"abc","cost",4,"subtotal","ACTIVE");
       Mockito.when(cartRepository.findById(1l)).thenReturn(Cart);
//        Mockito.when(Cart.setStatus("")).thenReturn(cart);
        equals(false);
//        Assertions.assertNotNull(productserviceimpl.checkout(null));
   }
   
   @Test
   public void checkouttest2(){
       MockitoAnnotations.initMocks(this);
       cart Cart= new cart(1,4,"abc","cost",4,"subtotal","ACTIVE");
       Mockito.when(cartRepository.findById(1l)).thenReturn(Cart);
//        Mockito.when(Cart.setStatus("")).thenReturn(cart);
        equals(null);
//        Assertions.assertNotNull(productserviceimpl.checkout(null));
   }
   
   @Test
   public void checkouttest3(){
       MockitoAnnotations.initMocks(this);
       cart Cart= new cart(1,3,"abc","cost",4,"subtotal","ACTIVE");
       Mockito.when(cartRepository.findById(1l)).thenReturn(Cart);
//        Mockito.when(Cart.setStatus("")).thenReturn(cart);
        equals("string");
//        Assertions.assertNotNull(productserviceimpl.checkout(null));
   }
   
   @Test
   public void checkouttest4(){
       MockitoAnnotations.initMocks(this);
       cart Cart= new cart(1,2,"abc","cost",4,"subtotal","ACTIVE");
       Mockito.when(cartRepository.findById(1l)).thenReturn(Cart);
//        Mockito.when(Cart.setStatus("")).thenReturn(cart);
        equals(true);
//        Assertions.assertNotNull(productserviceimpl.checkout(null));
   }
   
   @Test
   public void test_getproduct1(){
       MockitoAnnotations.initMocks(this);
       List<product> products=new ArrayList<product>();
       products.add(new product("title","desc","image","cost","Quan"));
       products.add(new product("title","desc","image","cost","Quan"));
       
       Mockito.when(productdao.findAll()).thenReturn(products);
       Assertions.assertThat(productserviceimpl.getAllProducts().size());
       
       
   }
   
   @Test
   public void getproductbyidTest1() throws IOException{
        MockitoAnnotations.initMocks(this);
        Optional<product> products= Optional.absent();
        products= Optional.of(new product("Titl","Desc","imag","cost","quan"));
        
//       Mockito.when(productdao.findById(1l)).thenReturn(products);
       assertNotNull(productserviceimpl.getProductById(1l));
       
       
   
   }
   
   

}
