package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.pojo.Address;



@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{
	
}
