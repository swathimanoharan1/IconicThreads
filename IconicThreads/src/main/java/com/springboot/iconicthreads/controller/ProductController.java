package com.springboot.iconicthreads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.iconicthreads.dto.ProductUpdateDTO;
import com.springboot.iconicthreads.model.Product;
import com.springboot.iconicthreads.service.ProductService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/iconicthreads/api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public Iterable<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping("/insert")
	public Product insert(@RequestBody Product product ) {
		return productService.createProduct(product);
	}
	
	@PutMapping("/update/{productId}")
	public Product update(@PathVariable String productId, @RequestBody ProductUpdateDTO productUpdateDto) {
		return productService.updateProduct(productId, productUpdateDto);
	}
	
	@DeleteMapping("/delete/{productId}")
	public void delete(@PathVariable String productId) {
		productService.deleteProduct(productId);
	}
	
	
	
	
	
	

}