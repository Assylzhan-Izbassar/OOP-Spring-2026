package l8.interfaces.tester;

import l8.interfaces.model.Account;
import l8.interfaces.model.CreditCard;
import l8.interfaces.model.PayPal;
import l8.interfaces.model.SavingAccount;
import l8.interfaces.service.PaymentProcessor;

public class PaymentTester {

	public static void main(String[] args) {
		Account a = new SavingAccount();
		a.deposit(5000); 
		
		System.out.println("Balance: " + a.getBalance());
		
		PaymentProcessor pp = new PaymentProcessor();
		
		CreditCard cc = new CreditCard();
		PayPal payPal = new PayPal();
		
		pp.setPaymentMethod(payPal);
		
		pp.process(a, 500);
		
		System.out.println("Balance: " + a.getBalance());
	}

}
