package l8.interfaces.tester;

import l8.interfaces.model.CreditCard;
import l8.interfaces.model.PayPal;
import l8.interfaces.service.PaymentProcessor;

public class PaymentTest {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.deposit(5000);
		
		PayPal pp = new PayPal();
		pp.deposit(2000);
		
		PaymentProcessor processor = new PaymentProcessor();
		
		processor.setPaymentMethod(cc);
		
		System.out.println("Initial balance: " + cc.getBalance());
		processor.process(750);
		System.out.println("Balance: " + cc.getBalance()); 
		
		processor.setPaymentMethod(pp);
		
		System.out.println("Initial balance: " + pp.getBalance());
		processor.process(1200);
		System.out.println("Balance: " + pp.getBalance()); 
	}

}
