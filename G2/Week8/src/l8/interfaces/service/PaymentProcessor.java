package l8.interfaces.service;

import l8.interfaces.contract.PaymentStrategy;

public class PaymentProcessor {
	private PaymentStrategy paymentMethod;
	
	public void setPaymentMethod(PaymentStrategy paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void process(double amount) {
		if (this.paymentMethod == null) {
			throw new IllegalArgumentException("The method haven't provided!");
		}
		paymentMethod.pay(amount);
	}
}
