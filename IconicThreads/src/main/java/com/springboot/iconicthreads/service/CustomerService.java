package com.springboot.iconicthreads.service;

import java.util.List;

import com.springboot.iconicthreads.model.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();
	
	public Customer addCustomer(Customer customer);
	
	public Customer deleteCustomer(int customerId);
	
	public Customer updateCustomer(int customerId, Customer customer);

	public Iterable<Customer> getAllCustomer();

}
