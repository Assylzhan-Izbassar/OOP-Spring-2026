package l8.interfaces.model;

import l8.interfaces.contract.PaymentStrategy;

public class PayPal implements PaymentStrategy<Account> {
	private static final double COMMISION = 0.01;
	@Override
	public boolean pay(Account account, double amount) {
		return account.withdraw(amount + amount * PayPal.COMMISION);
	}
}
