package com.springboot.iconicthreads.service;

import java.util.List;

import com.springboot.iconicthreads.model.Payment;
import com.springboot.iconicthreads.model.PaymentMode;
import com.springboot.iconicthreads.model.PaymentStatus;

public interface PaymentService {
	
	public Payment processPayment(String customerId, PaymentMode paymentMode, double amount);
	
	public Payment getPaymentById(String paymentId);
	
	public List<Payment> getPaymentsForOrder(String orderId);
	
	public PaymentStatus getPaymentStatus(String paymentId);
	
	public Payment updatePaymentStatus(String paymentId, PaymentStatus paymentStatus);
	
	public boolean verifyPayment(String paymentId, double paymentAmount);
	
	public void confirmPayment(String paymentId);
	
	public void cancelPayment(String paymentId);

}

