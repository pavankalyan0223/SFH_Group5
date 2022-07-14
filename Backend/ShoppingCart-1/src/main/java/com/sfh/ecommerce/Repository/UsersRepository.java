package com.sfh.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfh.ecommerce.model.Users;
 
public interface UsersRepository extends JpaRepository<Users, Integer> {
 
}