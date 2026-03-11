package l8.interfaces.model;

import l8.interfaces.contract.PaymentStrategy;

public class Checkout {
	private PaymentStrategy method;
	
	public void setPaymentMethod(PaymentStrategy method) {
		this.method = method;
	}
	
	public boolean executePayment(double amount) {
		if (this.method == null) {
			return false;
		}
		return this.method.pay(amount);
	}
}
