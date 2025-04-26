package com.springboot.iconicthreads.dto;

import java.util.List;

import com.springboot.iconicthreads.model.Address;
import com.springboot.iconicthreads.model.Customer;
import com.springboot.iconicthreads.model.OrderItem;
import com.springboot.iconicthreads.model.OrderStatus;
import com.springboot.iconicthreads.model.Payment;

public class OrderUpdateDTO {
	
	private List<OrderItem> itemsOrdered;
	private double totalPrice;
	private boolean updateTotalPrice;
	private OrderStatus orderStatus;
	private boolean updateOrderStatus;
	private boolean isOrderShipped;
	private Address shippingAddress;
	private Payment payment;
	private Customer customer;
	
	
	public boolean isUpdateTotalPrice() {
		return updateTotalPrice;
	}
	public void setUpdateTotalPrice(boolean updateTotalPrice) {
		this.updateTotalPrice = updateTotalPrice;
	}
	public boolean isUpdateOrderStatus() {
		return updateOrderStatus;
	}
	public void setUpdateOrderStatus(boolean updateOrderStatus) {
		this.updateOrderStatus = updateOrderStatus;
	}
	public List<OrderItem> getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(List<OrderItem> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public boolean isOrderShipped() {
		return isOrderShipped;
	}
	public void setOrderShipped(boolean isOrderShipped) {
		this.isOrderShipped = isOrderShipped;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
