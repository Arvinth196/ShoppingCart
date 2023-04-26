package com.shoppingprod.shoppingprod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingprod.shoppingprod.entities.product;

@Repository
public interface productRepository extends JpaRepository<product, Long> {

}
