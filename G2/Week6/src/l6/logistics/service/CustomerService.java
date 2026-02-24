package l6.logistics.service;

import java.util.List;

import l6.logistics.model.Customer;

public final class CustomerService {
	public Customer createCustomer(String fullName) {
		return new Customer(fullName);
	}
	
	public void printCustomers(List<Customer> customers) {
		for (Customer c: customers) {
			System.out.println(c);
		}
	}
}
