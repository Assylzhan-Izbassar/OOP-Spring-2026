package model;

import java.time.LocalDate;
import java.util.List;

import pattern.PaymentMethod;

public class Order {
	private PaymentMethod payment;
	private List<Drink> drinks;
	private LocalDate date;
	
	public Order(List<Drink> drinks, PaymentMethod payment) {
		this.drinks = drinks;
		this.payment = payment;
		this.date = LocalDate.now();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Drink d: drinks) {
			sb.append(d + " * ");
		}
		return "Order: \n" + sb.toString();
	}

	public PaymentMethod getPayment() {
		return payment;
	}

	public List<Drink> getDrinks() {
		return drinks;
	}

	public LocalDate getDate() {
		return date;
	}
}
