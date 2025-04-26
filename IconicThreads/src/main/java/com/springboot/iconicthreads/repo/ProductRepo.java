package com.springboot.iconicthreads.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.iconicthreads.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, String>{
	
	@Query(" {'categories.categoryName': ?0} ")
	List<Product> findByCategoryName(String categoryName);

}
