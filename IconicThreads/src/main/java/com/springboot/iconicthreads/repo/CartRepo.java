package com.springboot.iconicthreads.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.iconicthreads.model.Cart;

@Repository
public interface CartRepo extends MongoRepository<Cart, String>{
	
	Cart findByCustomerId(String customerId);

}
