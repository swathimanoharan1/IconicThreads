package com.springboot.iconicthreads.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.iconicthreads.model.Payment;

@Repository
public interface PaymentRepo extends MongoRepository<Payment, String>{
	
	@Query("{'orders.orderId': ?0}")
	List<Payment> findPaymentsForOrder(String orderId);

}
