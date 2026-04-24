package service;

import pattern.PaymentMethod;

public class CardPayment implements PaymentMethod {

	@Override
	public boolean pay(double amount) {
		if (amount > 0) {
			System.out.println("Paying with a card " + amount + " KZT.");
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Card payment";
	}

}
