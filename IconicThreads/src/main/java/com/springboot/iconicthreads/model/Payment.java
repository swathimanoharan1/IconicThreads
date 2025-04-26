package com.springboot.iconicthreads.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="payment")
public class Payment {
	
	@Id
	private String paymentId;
	
	private String customerId;
	private PaymentMode paymentMode;
	private PaymentStatus paymentStatus;
	private String transactionId;
	private double amount;
	private boolean confirmed;
	
	@DBRef
    private List<Order> orders;
	
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public Payment(PaymentMode paymentMode, String transactionId, double amount) {
		this.paymentMode = paymentMode;
		this.transactionId = transactionId;
		this.amount = amount;
	}
	public Payment(String paymentId, PaymentMode paymentMode, PaymentStatus paymentStatus, String transactionId,
			double amount, boolean confirmed) {
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.amount = amount;
		this.confirmed = confirmed;
	}
	
	public Payment(String customerId, PaymentMode paymentMode, String transactionId, double amount, PaymentStatus paymentStatus) {
        this.customerId = customerId;
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
	
	

}
