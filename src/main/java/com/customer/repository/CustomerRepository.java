package com.customer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.pojo.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	Customer findByEmail(String email);
	
}
