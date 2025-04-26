package com.springboot.iconicthreads.controller;

import java.util.List;
//import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.iconicthreads.model.Customer;
import com.springboot.iconicthreads.service.CustomerService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/customer")

public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/chumma")
	public String chumma() {
		return "hello world";
	}
	
	@GetMapping("/getAllCustomer")
	public Iterable<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	
	@GetMapping("/all")
	public List<Customer> getCustomer(){
		return customerService.getCustomer();
	}
	
	@PostMapping("/insert")
	public Customer insert(@RequestBody Customer customer ) {
		return customerService.addCustomer(customer);
	}
	
	@PutMapping("/update/{customerId}")
	public Customer update(@PathVariable int customerId, @RequestBody Customer customer) {
		return customerService.updateCustomer(customerId, customer);
	}
	
	@DeleteMapping("/delete/{customerId}")
	public Customer delete(@PathVariable int customerId) {
		return customerService.deleteCustomer(customerId);
	}
}














