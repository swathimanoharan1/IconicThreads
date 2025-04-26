package com.springboot.iconicthreads.service;

import com.springboot.iconicthreads.model.Cart;

public interface CartService {
	
	public Cart viewCart(String customerId);
	
	public Cart addItemToCart(String customerId, String productId, int quantity);
	
	public void clearCart(String customerId);
	
	public void removeItemFromCart(String customerId, String cartItemId);
	
	public double calculateCartTotal(String customerId);
	
//	-------------------------------------------------------------------------
	
//	public Cart createCart(String customerId, Product productDetails);
//	
//	public Cart updateProductQuantity(String customerId, String productId, int newQuantity);
//	
//	public void deleteCart(String customerId);
//	
//	public void removeCartItem(String customerId, String productId);
//	
//	public double calculateTotalPrice(String customerId);
//	
//	public void persistCartState(String customerId, Cart cartDetails);
//	
//	public Cart retrieveCartState(String customerId);
	
	

}
