package model;

import java.util.ArrayList;
import java.util.List;

import pattern.PaymentMethod;

public class Order implements Cloneable {
	private List<IDrink> drinks;
	private PaymentMethod payment;
	
	{
		this.drinks = new ArrayList<IDrink>();
	}
	
	public Order(PaymentMethod payment) {
		this.payment = payment;
	}
	
	public Order(PaymentMethod payment, List<IDrink> drinks) {
		this(payment);
		this.drinks = drinks;
	}
	
	public double calcTotalCost() {
		double result = 0.0;
		for (IDrink drink: this.drinks) {
			result += drink.cost();
		}
		return result;
	}
	
	public void checkout() {
		if (!this.drinks.isEmpty()) 
			this.payment.pay(this.calcTotalCost());
	}

	public List<IDrink> getDrinks() {
		return drinks;
	}

	public PaymentMethod getPayment() {
		return payment;
	}
	
	public void addDrink(IDrink drink) {
		this.drinks.add(drink);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Order order = (Order) super.clone(); // shallow clone
		// ... deep clone
		return order;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (IDrink drink: this.drinks) {
			sb.append(drink.description() + " ");
		}
		
		return "Order: " + sb.toString(); 
	}
}
