package com.springboot.iconicthreads.exception;

public class PaymentNotFoundException extends RuntimeException{
	
	public PaymentNotFoundException(String message) {
		super(message);
	}

}
