package com.sfh.ecommerce.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sfh.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	 
	}
