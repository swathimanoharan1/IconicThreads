package com.springboot.iconicthreads.serviceImpl;

import com.springboot.iconicthreads.model.Cart;
import com.springboot.iconicthreads.model.CartItem;
import com.springboot.iconicthreads.model.Product;
import com.springboot.iconicthreads.repo.CartRepo;
import com.springboot.iconicthreads.repo.ProductRepo;
import com.springboot.iconicthreads.service.CartService;

public class CartServiceImpl implements CartService{
	
	private final CartRepo cartRepo;
	private final ProductRepo productRepo;
	
	public CartServiceImpl(CartRepo cartRepo, ProductRepo productRepo) {
		this.cartRepo = cartRepo;
		this.productRepo = productRepo;
	}

	@Override
	public Cart viewCart(String customerId) {
		
		return cartRepo.findByCustomerId(customerId);
	}
	
	@Override
	public Cart addItemToCart(String customerId, String productId, int quantity) {
		
		Cart cart = cartRepo.findByCustomerId(customerId);
		
		if(cart == null) {
			cart = new Cart();
			cart.setCustomerId(customerId);
		}
			
		Product product = productRepo.findById(productId).orElseThrow( () -> new RuntimeException("Product not found"));
		
		CartItem cartItem = new CartItem();
		cartItem.setProduct(product);
		cartItem.setQuantity(quantity);
		
		cart.getItems().add(cartItem);
		return cartRepo.save(cart);
	}

	@Override
	public void clearCart(String customerId) {

		Cart cart = cartRepo.findByCustomerId(customerId);
		
		if(cart != null) {
			cart.getItems().clear();
			cartRepo.save(cart);
		}
	}

	@Override
	public void removeItemFromCart(String customerId, String cartItemId) {
		
		Cart cart = cartRepo.findByCustomerId(customerId);
		
		if(cart != null) {
			cart.getItems().removeIf(cartItem -> cartItem.getCartItemId().equals(cartItemId));
			cartRepo.save(cart);
		}
		
	}

	@Override
	public double calculateCartTotal(String customerId) {
		
		Cart cart = cartRepo.findByCustomerId(customerId);
		
		if(cart != null) {
			double cartTotal = 0.0;
			
			for(CartItem cartItem: cart.getItems()) {
				Product product = cartItem.getProduct();
				double itemTotal = product.getProductPrice()*cartItem.getQuantity();
				cartTotal += itemTotal;
			}
			return cartTotal;
		}
		return 0.0;
	}
	
//	--------------------------------------------------------------------
//
//	@Override
//	public Cart createCart(String customerId, Product productDetails) {
//		
//		Iterable<Cart> carts = cartrepo.findByCustomerId(customerId);
//		Iterator<Cart> cartIterator = carts.iterator();
//		
//		if(cartIterator.hasNext()) {
//			retrieve the cart if exists
//			Cart cart = cartIterator.next();
//			CartItem cartItem = createCartItem(productDetails);
//			cart.getItems().add(cartItem);
//		}
//		else {
//			if cart doen't exists create new cart
//			Cart newCart = new Cart();
//			newCart
//		}
//
//	     Update the cart in the repository
//	    return cartrepo.save(cart);
//		
//		return null;
//	}
//
//	@Override
//	public Cart updateProductQuantity(String customerId, String productId, int newQuantity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteCart(String customerId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void removeCartItem(String customerId, String productId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public double calculateTotalPrice(String customerId) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void persistCartState(String customerId, Cart cartDetails) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Cart retrieveCartState(String customerId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}
