package com.moviebs.serviceimpl;
import com.moviebs.service.*;
import com.moviebs.model.*;
import com.moviebs.repos.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//indicates that it's a service component and can be automatically detected during component scanning
@Service
public class CustomerServiceImpl implements CustomerService
{

	//indicates that it is a dependency that will be automatically injected
	@Autowired
	private CustomerRepository customerRepository;
	
	// indicates that this method overrides a method from a superclass or interface.
	@Override
	
	//save customer
	public Customer saveCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}

	@Override
	public Integer isCustomerPresent(Customer customer) 
	{
		 Customer customer1 = customerRepository.getCustomerByEmailAndName(customer.getEmail(),customer.getName());
	     return customer1!=null ? customer1.getId(): null ;
	}
}
