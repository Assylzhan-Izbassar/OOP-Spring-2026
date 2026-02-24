package l6.logistic.service;

import java.util.List;

import l6.logistic.model.Customer;

public class CustomerService {
	public Customer createCustomer(String fullName) {
		return new Customer(fullName);
	}
	
	public void printCustomers(List<Customer> customers) {
		for (Customer c: customers) {
			System.out.println(c);
		}
	}
}
