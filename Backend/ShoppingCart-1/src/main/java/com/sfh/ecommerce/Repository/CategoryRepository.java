package com.sfh.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfh.ecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	 
	}

