package com.springboot.iconicthreads.dto;

import com.springboot.iconicthreads.model.PaymentMode;
import com.springboot.iconicthreads.model.PaymentStatus;

public class PaymentUpdateDTO {
	
	private PaymentMode paymentMode;
	private PaymentStatus paymentStatus;
	private String transactionId;
	private double amount;
	private boolean confirmed;
	
	
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
	
	

}
