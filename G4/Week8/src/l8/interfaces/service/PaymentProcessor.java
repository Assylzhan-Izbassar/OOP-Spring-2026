package l8.interfaces.service;

import l8.interfaces.contract.PaymentStrategy;
import l8.interfaces.model.Account;

public class PaymentProcessor {
	private PaymentStrategy<Account> paymentMethod;
	
	public void setPaymentMethod(PaymentStrategy<Account> paymentMethod) {
		if (paymentMethod != null) {
			this.paymentMethod = paymentMethod;
		}
	}
	
	public void process(Account a, int amount) {
		if (this.paymentMethod == null) {
			throw new IllegalArgumentException("Haven't set the payment method!");
		}
		paymentMethod.pay(a, amount);
	}
}
