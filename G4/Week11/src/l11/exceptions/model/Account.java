package l11.exceptions.model;

import l11.exceptions.exception.InsufficientFundsException;

public class Account {
	public double balance;
	
	public boolean withdraw(double amount) throws InsufficientFundsException {
		if (this.balance >= amount && amount > 0) {
			this.balance -= amount;
		} else {
			if (this.balance < amount) {
				throw new InsufficientFundsException("The balance is not enough!");
			}
			return false;
		}
		return true;
	}
}
