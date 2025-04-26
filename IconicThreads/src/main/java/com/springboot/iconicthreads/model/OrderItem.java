package com.springboot.iconicthreads.model;

public class OrderItem {
	
	private String productId;
	private String productName;
	private int orderedQuantity;
	private double unitPrice;
	
	
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
	public int getOrderedQuantity() {
		return orderedQuantity;
	}
	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public OrderItem(String productId, String productName, int orderedQuantity, double unitPrice) {
		this.productId = productId;
		this.productName = productName;
		this.orderedQuantity = orderedQuantity;
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "OrderItem [productId=" + productId + ", productName=" + productName + ", orderedQuantity="
				+ orderedQuantity + ", unitPrice=" + unitPrice + "]";
	}
	
	

}
