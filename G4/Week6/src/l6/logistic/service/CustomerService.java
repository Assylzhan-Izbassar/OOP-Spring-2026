package l6.logistic.service;

import java.util.List;

import l6.logistic.model.Customer;

public class CustomerService {
	public Customer createCustomer(String name) {
		return new Customer(name);
	}
	
	public void printAllCustomers(List<Customer> customers) {	
		for (Customer c: customers) {
			System.out.println(c);
		}
	}
}
