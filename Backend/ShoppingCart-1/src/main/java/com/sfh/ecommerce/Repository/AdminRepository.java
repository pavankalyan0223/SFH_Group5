package com.sfh.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfh.ecommerce.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	 
	}

