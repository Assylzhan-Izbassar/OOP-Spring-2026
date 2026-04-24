package model;

import java.util.ArrayList;
import java.util.List;

import pattern.PaymentMethod;

public class Order {
	private PaymentMethod method;
	private List<Drink> drinks;
	
	public Order(ArrayList<Drink> drinks, PaymentMethod method) {
		this.drinks = drinks;
		this.method = method;
	}
	
	public boolean checkout(double amount) {
		return method.pay(amount);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (IDrink d: this.drinks) {
			sb.append(d.description() + ", ");
		}
		
		return "Order: " + sb.toString(); 
	}
}
