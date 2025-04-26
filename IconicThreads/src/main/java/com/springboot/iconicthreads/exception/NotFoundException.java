package com.springboot.iconicthreads.exception;

public class NotFoundException extends RuntimeException{
	
	public NotFoundException (String message) {
		super(message);
	}

}
