package com.sfh.ecommerce.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sfh.ecommerce.model.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
	 
	}
