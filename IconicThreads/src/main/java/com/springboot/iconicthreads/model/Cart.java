package com.springboot.iconicthreads.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carts")
public class Cart {
	
	@Id
	private String cartId;
	private String customerId;
	@DBRef
	private List<CartItem> items = new ArrayList<>();
	
	private String cartStatus;
	private long createdAt;
	private long updatedAt;
	
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	public String getCartStatus() {
		return cartStatus;
	}
	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}
	public long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}
	public long getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Cart(String cartId, String customerId, List<CartItem> items, String cartStatus, long createdAt,
			long updatedAt) {
		this.cartId = cartId;
		this.customerId = customerId;
		this.items = items;
		this.cartStatus = cartStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Cart() {
	}
	
	

}
