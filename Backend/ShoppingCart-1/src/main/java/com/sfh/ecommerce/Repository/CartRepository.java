package com.sfh.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfh.ecommerce.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	 
	}

