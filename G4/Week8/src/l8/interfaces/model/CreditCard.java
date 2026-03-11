package l8.interfaces.model;

import l8.interfaces.contract.PaymentStrategy;

public class CreditCard implements PaymentStrategy<Account> {

	@Override
	public boolean pay(Account account, double amount) {
		return account.withdraw(amount);
	}

}
