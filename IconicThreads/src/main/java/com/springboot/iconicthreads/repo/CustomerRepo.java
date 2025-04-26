package com.springboot.iconicthreads.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.iconicthreads.model.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Integer>{

}
