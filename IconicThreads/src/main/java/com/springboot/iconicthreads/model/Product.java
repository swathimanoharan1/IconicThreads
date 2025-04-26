package com.springboot.iconicthreads.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="products")
public class Product {
	
	@Id
	private String productId;
	
	private String productName;
	private String productDesc;
	private double productPrice;
	private List<String> productImages;
	private List<String> productSize;
	private int productStockAvail;
	
	@DBRef
	private Category category;
	
	private String productCategory;
	private String productBrand;
	private Date productReleaseDate;
	private double productrating;
	private List<Review> productReview;
	private boolean isFeatured;
	private boolean isNewProduct;
	private String productMaterial;
	private boolean isInStock;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
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
	public List<String> getProductSize() {
		return productSize;
	}
	public void setProductSize(List<String> productSize) {
		this.productSize = productSize;
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
	public double getProductrating() {
		return productrating;
	}
	public void setProductrating(double productrating) {
		this.productrating = productrating;
	}
	public List<Review> getProductReview() {
		return productReview;
	}
	public void setProductReview(List<Review> productReview) {
		this.productReview = productReview;
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
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productPrice=" + productPrice + ", productImages=" + productImages + ", productSize=" + productSize
				+ ", productStockAvail=" + productStockAvail + ", productCategory=" + productCategory
				+ ", productBrand=" + productBrand + ", productReleaseDate=" + productReleaseDate + ", productrating="
				+ productrating + ", productReview=" + productReview + ", isFeatured=" + isFeatured + ", isNewProduct="
				+ isNewProduct + ", productMaterial=" + productMaterial + ", isInStock=" + isInStock + "]";
	}
	
	
	public Product(String productId, String productName, String productDesc, double productPrice,
			List<String> productImages, List<String> productSize, int productStockAvail, String productCategory,
			String productBrand, Date productReleaseDate, double productrating, List<Review> productReview,
			boolean isFeatured, boolean isNewProduct, String productMaterial, boolean isInStock, Category category) {
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.productImages = productImages;
		this.productSize = productSize;
		this.productStockAvail = productStockAvail;
		this.productCategory = productCategory;
		this.productBrand = productBrand;
		this.productReleaseDate = productReleaseDate;
		this.productrating = productrating;
		this.productReview = productReview;
		this.isFeatured = isFeatured;
		this.isNewProduct = isNewProduct;
		this.productMaterial = productMaterial;
		this.isInStock = isInStock;
		this.category = category;
	}
	
	
	


}
