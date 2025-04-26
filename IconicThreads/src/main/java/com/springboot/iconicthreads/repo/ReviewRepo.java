package com.springboot.iconicthreads.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.springboot.iconicthreads.model.Review;

public interface ReviewRepo extends MongoRepository<Review, String>{
	
	@Query("{'reviews.reviewDescription': ?0}")
	List<Review> findAllReviewsForProduct(String productId);

}
