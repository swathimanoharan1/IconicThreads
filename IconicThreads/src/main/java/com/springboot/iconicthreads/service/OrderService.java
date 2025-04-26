package com.springboot.iconicthreads.service;

import com.springboot.iconicthreads.dto.OrderUpdateDTO;
import com.springboot.iconicthreads.model.Order;

public interface OrderService {
	
	public Iterable<Order> getAllOrders();
	
	public Order getOrderById(String orderId);
	
	public Order createOrder(Order order);
	
	public void deleteOrder(String orderId);
	
	public Order updateOrder(String orderId, OrderUpdateDTO orderUpdateDto);
	
	public Order calculateTotalPrice(Order order);
	

}
