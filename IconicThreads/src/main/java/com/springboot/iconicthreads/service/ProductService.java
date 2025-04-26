package com.springboot.iconicthreads.service;

import java.util.List;

import com.springboot.iconicthreads.dto.ProductUpdateDTO;
import com.springboot.iconicthreads.model.Product;

public interface ProductService {
	
	public Iterable<Product> getAllProducts();
	
	public Product getProductById(String productId);
	
	public Product createProduct(Product product);
	
	public Product updateProduct(String productId, ProductUpdateDTO productUpdateDto);
	
	public void deleteProduct(String productId);
	
	public List<Product> getProductsByCategory(String category);
	
	public List<Product> getProductByBrand(String brand);
	
	public List<Product> getfeaturedProducts();
	
	public List<Product> getNewProducts();

}
