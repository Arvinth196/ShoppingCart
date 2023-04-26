package com.shoppingprod.shoppingprod.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoppingprod.shoppingprod.entities.cart;

@Repository
public interface CartItemsRepository extends JpaRepository<cart, Long> {
	
//	cart findById(long id);
//	
//	@Query("SELECT c FROM cart c WHERE c.status='ACTIVE'")
//	List<cart> findAllAndStatus(String status);
	
	
	@Query("SELECT c FROM cart c WHERE c.userId=?1 AND c.status='ACTIVE'")
	List<cart> findAllItems(int userId);
	@Query("SELECT c FROM cart c WHERE c.userId=?2 AND c.status='ACTIVE' AND c.id=?1")
	cart findById(long Id,int userId);

	

	


}
