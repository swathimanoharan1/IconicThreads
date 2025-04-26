package com.springboot.iconicthreads.service;

import java.util.List;

import com.springboot.iconicthreads.model.Category;
import com.springboot.iconicthreads.model.Customer;
import com.springboot.iconicthreads.model.Order;
import com.springboot.iconicthreads.model.Product;
import com.springboot.iconicthreads.model.Review;

public interface SearchService {
	
	public List<Product> searchProductsByKeywords(String keyword);
	
	public List<Category> filterProductsByCategory(String category);
	
	public List<Product> filterProductsByPriceRange(double price);
	
	public List<String> autocompleteSuggestion(String prefix);
	
	public List<Order> searchOrdersByCustomer(String customerId);

	public List<Customer> searchCustomersByName(String customerName);
	
	public List<Review> searchReviewsByProduct (String productId);
	
}
