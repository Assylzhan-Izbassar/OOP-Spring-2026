package l8.interfaces.app;

import l8.interfaces.model.CreditCard;
import l8.interfaces.model.PayPal;
import l8.interfaces.service.PaymentProcessor;

public class PaymentTester {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		PayPal pp = new PayPal();
		
		PaymentProcessor pProcess = new PaymentProcessor();
		
		pProcess.setPaymentMethod(cc);
		pProcess.process(1000);
		
		pProcess.setPaymentMethod(pp);
		pProcess.process(2000);
	}

}
