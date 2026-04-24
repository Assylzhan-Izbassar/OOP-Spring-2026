package service;

import pattern.PaymentMethod;

public class CardPayment implements PaymentMethod {
	@Override
	public boolean pay(double amount) {
		if (amount > 0) {
			System.out.println("Paying with card: " + amount + " KZT.");
			return true;
		}
		return false;
	}

}
