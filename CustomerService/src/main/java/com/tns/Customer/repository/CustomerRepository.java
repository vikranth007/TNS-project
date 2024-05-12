package com.tns.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.Customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
