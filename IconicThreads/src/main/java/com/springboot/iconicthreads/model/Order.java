package com.springboot.iconicthreads.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
public class Order {
	
	@Id
	private String orderId;
	
	private Date orderDate;
	private List<OrderItem> itemsOrdered;
	private double totalPrice;
	private OrderStatus orderStatus;
	private boolean isOrderShipped;
	private Address shippingAddress;
	private Payment payment;
	private Customer customer;
	
	
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
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
	
	
	public Order(String orderId, Date orderDate, List<OrderItem> itemsOrdered, double totalPrice,
			boolean isOrderShipped, Address shippingAddress, Payment payment) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.itemsOrdered = itemsOrdered;
		this.totalPrice = totalPrice;
		this.isOrderShipped = isOrderShipped;
		this.shippingAddress = shippingAddress;
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", itemsOrdered=" + itemsOrdered
				+ ", totalPrice=" + totalPrice + ", isOrderShipped=" + isOrderShipped + ", shippingOrders="
				+ shippingAddress + "]";
	}
	

}
