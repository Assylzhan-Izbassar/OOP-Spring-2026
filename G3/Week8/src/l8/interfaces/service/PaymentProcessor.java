package l8.interfaces.service;

import l8.interfaces.contract.PaymentStrategy;

public class PaymentProcessor {
	private PaymentStrategy method;
	
	public void setPaymentMethod(PaymentStrategy newMethod) {
		this.method = newMethod;
	}
	
	public void process(double amount) {
		if (this.method == null) {
			throw new IllegalArgumentException(
					"Please, provide some payment method!");
		}
		
		this.method.pay(amount);
	}
}
