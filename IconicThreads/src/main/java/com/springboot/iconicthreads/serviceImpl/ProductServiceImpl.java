package com.springboot.iconicthreads.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.iconicthreads.dto.ProductUpdateDTO;
import com.springboot.iconicthreads.exception.NotFoundException;
import com.springboot.iconicthreads.model.Product;
import com.springboot.iconicthreads.repo.ProductRepo;
import com.springboot.iconicthreads.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public Iterable<Product> getAllProducts() {
		return this.productRepo.findAll();
	}

	@Override
	public Product getProductById(String productId) {
		Optional<Product> productDetails = productRepo.findById(productId);
		return productDetails.orElseThrow(() -> new NotFoundException("Product not found for the productId: " +productId));
	}

	@Override
	public Product createProduct(Product product) {
		
		if(product.getProductId() == null || productRepo.existsById(product.getProductId())) {
			throw new IllegalArgumentException("Cannot added product as productId: " +product.getProductId()+ " already exists: ");
		}
		return productRepo.save(product);

	}
	
	@Override
	public Product updateProduct(String productId, ProductUpdateDTO productUpdateDto) {
		Product existingProduct = productRepo.findById(productId).orElseThrow(() -> new NotFoundException("The product of productId: " + productId +" you want to update does not exist."));
		if(productUpdateDto.getProductName() != null) {
			existingProduct.setProductName(productUpdateDto.getProductName());
		}
		if(productUpdateDto.getProductDesc() != null) {
			existingProduct.setProductDesc(productUpdateDto.getProductDesc());
		}
		if(productUpdateDto.getProductPrice() != 0.0) {
			existingProduct.setProductPrice(productUpdateDto.getProductPrice());
		}
		if(productUpdateDto.getProductImages() != null) {
			existingProduct.setProductImages(productUpdateDto.getProductImages());
		}
		if(productUpdateDto.getProductStockAvail() != 0) {
			existingProduct.setProductStockAvail(productUpdateDto.getProductStockAvail());
		}
		if(productUpdateDto.getCategory() != null) {
			existingProduct.setCategory(productUpdateDto.getCategory());
		}
		if(productUpdateDto.getProductCategory() != null) {
			existingProduct.setProductCategory(productUpdateDto.getProductCategory());
		}
		if(productUpdateDto.getProductBrand() != null) {
			existingProduct.setProductBrand(productUpdateDto.getProductBrand());
		}
		if(productUpdateDto.getProductReleaseDate() != null) {
			existingProduct.setProductReleaseDate(productUpdateDto.getProductReleaseDate());
		}
		existingProduct.setFeatured(productUpdateDto.isFeatured());
		existingProduct.setNewProduct(productUpdateDto.isNewProduct());
		if(productUpdateDto.getProductMaterial() != null) {
			existingProduct.setProductMaterial(productUpdateDto.getProductMaterial());
		}
		existingProduct.setInStock(productUpdateDto.isInStock());
		return productRepo.save(existingProduct);
	}

	@Override
	public void deleteProduct(String productId) {
		
		if(productRepo.existsById(productId)) {
			productRepo.deleteById(productId);
		}
		else {
			throw new NotFoundException("The product with ID: " +productId+ " does not exists");
		}
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		
		return productRepo.findByCategoryName(category);
	}

	@Override
	public List<Product> getProductByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getfeaturedProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getNewProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
