package l8.interfaces.service;

import l8.interfaces.model.Checkout;

public class PaymentProcessor {
	public boolean process(Checkout checkout, int amount) {
		return checkout.executePayment(amount);
	}
}
