package com.springboot.iconicthreads.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.iconicthreads.model.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order, String>{

}
