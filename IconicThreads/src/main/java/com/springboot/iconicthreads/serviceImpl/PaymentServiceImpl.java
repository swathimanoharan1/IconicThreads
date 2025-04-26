package com.springboot.iconicthreads.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.iconicthreads.exception.PaymentNotFoundException;
import com.springboot.iconicthreads.model.Payment;
import com.springboot.iconicthreads.model.PaymentMode;
import com.springboot.iconicthreads.model.PaymentStatus;
import com.springboot.iconicthreads.repo.PaymentRepo;
import com.springboot.iconicthreads.service.PaymentService;

public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepo paymentRepo;
	
	private String generateTransactionId(){
		return UUID.randomUUID().toString();
	}

	@Override
	public Payment processPayment(String customerId, PaymentMode paymentMode, double amount) {
		
		String transactionId = generateTransactionId();
		Payment payment = new Payment(customerId, paymentMode, transactionId, amount, PaymentStatus.PENDING);
		return paymentRepo.save(payment);
	}

	@Override
	public Payment getPaymentById(String paymentId) {

		return paymentRepo.findById(paymentId).orElseThrow( ()-> new PaymentNotFoundException ("Payment not found for the payment ID: " +paymentId));
		
	}

	@Override
	public List<Payment> getPaymentsForOrder(String orderId) {

		return paymentRepo.findPaymentsForOrder(orderId);
	}

	@Override
	public PaymentStatus getPaymentStatus(String paymentId) {

		Payment payment = getPaymentById(paymentId);
		return payment.getPaymentStatus();
	}

	@Override
	public Payment updatePaymentStatus(String paymentId, PaymentStatus paymentStatus) {
		
		Payment payment = getPaymentById(paymentId);
		payment.setPaymentStatus(paymentStatus);
		return paymentRepo.save(payment);
	}

	@Override
	public boolean verifyPayment(String paymentId, double paymentAmount) {
		
		Payment payment = getPaymentById(paymentId);
		return payment.getAmount() == paymentAmount;
	}

	@Override
	public void confirmPayment(String paymentId) {
		
		Payment payment = getPaymentById(paymentId);
		payment.setPaymentStatus(PaymentStatus.APPROVED);
		paymentRepo.save(payment);
		
	}

	@Override
	public void cancelPayment(String paymentId) {
		
		Payment payment = getPaymentById(paymentId);
		payment.setPaymentStatus(PaymentStatus.DECLINED);
		paymentRepo.delete(payment);
		
	}

	
}
