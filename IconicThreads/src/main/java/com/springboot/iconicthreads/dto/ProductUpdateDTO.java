package com.springboot.iconicthreads.dto;

import java.util.Date;
import java.util.List;

import com.springboot.iconicthreads.model.Category;

public class ProductUpdateDTO {
	
	private String productName;
	private String productDesc;
	private double productPrice;
	private List<String> productImages;
	private int productStockAvail;
	private Category category;
	private String productCategory;
	private String productBrand;
	private Date productReleaseDate;
	private boolean isFeatured;
	private boolean isNewProduct;
	private String productMaterial;
	private boolean isInStock;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public List<String> getProductImages() {
		return productImages;
	}
	public void setProductImages(List<String> productImages) {
		this.productImages = productImages;
	}
	public int getProductStockAvail() {
		return productStockAvail;
	}
	public void setProductStockAvail(int productStockAvail) {
		this.productStockAvail = productStockAvail;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public Date getProductReleaseDate() {
		return productReleaseDate;
	}
	public void setProductReleaseDate(Date productReleaseDate) {
		this.productReleaseDate = productReleaseDate;
	}
	public boolean isFeatured() {
		return isFeatured;
	}
	public void setFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}
	public boolean isNewProduct() {
		return isNewProduct;
	}
	public void setNewProduct(boolean isNewProduct) {
		this.isNewProduct = isNewProduct;
	}
	public String getProductMaterial() {
		return productMaterial;
	}
	public void setProductMaterial(String productMaterial) {
		this.productMaterial = productMaterial;
	}
	public boolean isInStock() {
		return isInStock;
	}
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}
	
	

}
