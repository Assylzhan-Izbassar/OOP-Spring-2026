package service;

import pattern.PaymentMethod;

public class CashPayment implements PaymentMethod {

	@Override
	public boolean pay(double amount) {
		if (amount > 0) {
			System.out.println("Paying with a cash " + amount + " KZT.");
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Cash payment";
	}
}
