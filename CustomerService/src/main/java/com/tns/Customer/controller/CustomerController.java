package com.tns.Customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tns.Customer.entity.Customer;
import com.tns.Customer.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repo;
	
	@GetMapping("/customer")
	public List<Customer> getCustomer()
	{
		return repo.findAll();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Long id)
	{
		return repo.findById(id).get();
	}
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return repo.save(customer);
	}
	
	@PutMapping("/customer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer,@PathVariable Long id)
	{
		customer.setId(id);
		return repo.save(customer);
	}
	
	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable Long id)
	{
		repo.deleteById(id);
	}
}
