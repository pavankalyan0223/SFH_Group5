package com.sfh.ecommerce.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sfh.ecommerce.model.SalesLog;

public interface SalesLogRepository extends JpaRepository<SalesLog, Integer> {
	 
	}
