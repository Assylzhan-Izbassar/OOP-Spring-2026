package model;

import java.time.LocalDate;
import java.util.List;

import pattern.OrderState;
import pattern.PaymentMethod;

public class Order {
	private PaymentMethod payment;
	private List<Drink> drinks;
	private LocalDate orderedDate;
	
	private OrderState status;
	
	public Order(List<Drink> drinks, PaymentMethod payment) {
		this.drinks = drinks;
		this.payment = payment;
		this.orderedDate = LocalDate.now();
	}
	
	public double getTotalCost() {
		double result = 0.0;
		for (Drink d: drinks) {
			result += d.cost();
		}
		return result;
	}
	
	public boolean checkout() {
		if (!this.drinks.isEmpty()) {
			return payment.pay(this.getTotalCost());
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Drink d: drinks) {
			sb.append(d + "\n");
		}
		return "Order: " + sb.toString(); 
	}

	public PaymentMethod getPayment() {
		return payment;
	}

	public List<Drink> getDrinks() {
		return drinks;
	}

	public LocalDate getOrderedDate() {
		return orderedDate;
	}

	public OrderState getStatus() {
		return status;
	}

	public void setStatus(OrderState status) {
		this.status = status;
	}
}
