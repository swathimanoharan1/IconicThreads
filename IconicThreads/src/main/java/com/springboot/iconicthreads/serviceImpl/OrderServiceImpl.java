package com.springboot.iconicthreads.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.iconicthreads.dto.OrderUpdateDTO;
import com.springboot.iconicthreads.exception.NotFoundException;
import com.springboot.iconicthreads.model.Order;
import com.springboot.iconicthreads.model.OrderItem;
import com.springboot.iconicthreads.repo.OrderRepo;
import com.springboot.iconicthreads.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepo orderRepo;

	@Override
	public Iterable<Order> getAllOrders() {
		return this.orderRepo.findAll();
	}

	@Override
	public Order getOrderById(String orderId) {
		Optional<Order> orderDetails = orderRepo.findById(orderId);
		return orderDetails.orElseThrow(() -> new NotFoundException("Order not found for orderId: "+orderId));
	}

	@Override
	public Order createOrder(Order order) {
		if(order.getOrderId() == null || orderRepo.existsById(order.getOrderId())) {
			throw new IllegalArgumentException("Cannot create order as orderId: " + order.getOrderId()+ " already exsists: " );
		}
		return orderRepo.save(order);
	}
	
	@Override
	public Order updateOrder(String orderId, OrderUpdateDTO orderUpdateDto) {
		
		Order existingOrder = orderRepo.findById(orderId).orElseThrow(() -> new NotFoundException("The order of orderId: " + orderId +" you want to update does not exist."));
		if(orderUpdateDto.getItemsOrdered() != null) {
			existingOrder.setItemsOrdered(orderUpdateDto.getItemsOrdered());
		}
		if(orderUpdateDto.getShippingAddress() != null) {
			existingOrder.setShippingAddress(orderUpdateDto.getShippingAddress());
		}
		if(orderUpdateDto.getPayment() != null) {
			existingOrder.setPayment(orderUpdateDto.getPayment());
		}
		if(orderUpdateDto.getCustomer() != null) {
			existingOrder.setCustomer(orderUpdateDto.getCustomer());
		}
		if(orderUpdateDto.isUpdateTotalPrice() && orderUpdateDto.getTotalPrice() != 0.0) {
			existingOrder.setTotalPrice(orderUpdateDto.getTotalPrice());
		}
		if(orderUpdateDto.isUpdateOrderStatus() == true) {
			existingOrder.setOrderStatus(orderUpdateDto.getOrderStatus());
		}
		existingOrder.setOrderShipped(orderUpdateDto.isOrderShipped());
		return orderRepo.save(existingOrder);
	}

	@Override
	public void deleteOrder(String orderId) {
		
		if(orderRepo.existsById(orderId)) {
			orderRepo.deleteById(orderId);
		}
		else {
			throw new NotFoundException("The Order with Id: " +orderId+ " does not exists");
		}
	}

	@Override
	public Order calculateTotalPrice(Order order) {

		double totalPrice = 0.0;
		
		if( order != null && order.getItemsOrdered()!= null) {
			for(OrderItem orderItem: order.getItemsOrdered()) {
				String productId = orderItem.getProductId();
				int orderedQuantity = orderItem.getOrderedQuantity();
				double unitPrice = orderItem.getUnitPrice();
				
				double itemTotalPrice = orderedQuantity*unitPrice;
				
				totalPrice += itemTotalPrice;
			}
		order.setTotalPrice(totalPrice);
		}
		else {
			throw new IllegalArgumentException("Cart could be empty");
		}
		try {
			return orderRepo.save(order);
		}
		catch(Exception e) {
			throw new RuntimeException("Error saving the order ", e);
		}
		
	}


	
	
	
}
