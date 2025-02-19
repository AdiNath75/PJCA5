package com.code.springdemo.dao;

import java.util.List;

import com.code.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomers(int theId);

	public List<Customer> searchCustomers(String theSearchName);

}
