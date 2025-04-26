package com.springboot.iconicthreads.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.iconicthreads.model.Customer;
import com.springboot.iconicthreads.repo.CustomerRepo;
import com.springboot.iconicthreads.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public List<Customer> getCustomer() {
		
		return customerRepo.findAll();
	}
	
	@Override
	public Iterable<Customer> getAllCustomer(){
		return this.customerRepo.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public Customer deleteCustomer(int customerId) {
		Customer customer = customerRepo.findById(customerId).get();
		customerRepo.delete(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(int customerId, Customer customer) {
		Customer customerUpdate = customerRepo.findById(customerId).get();
		customerUpdate.setFirstName(customer.getFirstName());
		customerUpdate.setLastName(customer.getLastName());
		customerUpdate.setPhoneNumber(customer.getPhoneNumber());
		customerUpdate.setAddress(customer.getAddress());
		customerRepo.save(customerUpdate);
		return customerUpdate;
	}
	
	

}
