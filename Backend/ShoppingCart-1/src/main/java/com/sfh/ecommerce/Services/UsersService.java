package com.sfh.ecommerce.Services;


import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfh.ecommerce.Repository.UsersRepository;
import com.sfh.ecommerce.model.Users;
 
@Service
@Transactional
public class UsersService {
 
    @Autowired
    private UsersRepository repo;
     
    public List<Users> listAll() {
        return repo.findAll();
    }
     
    public void save(Users user) {
        repo.save(user);
    }
     
    public Users get(Integer id) {
        return repo.findById(id).get();
    }
    
    public void update(Users user) {
       repo.save(user);
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
    
}