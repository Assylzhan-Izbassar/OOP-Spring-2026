package l8.interfaces.model;

import l8.interfaces.contract.PaymentStrategy;

public abstract class Payment implements PaymentStrategy {
	private double balance;
	
	public double getBalance() {
		return this.balance;
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}
	
	public boolean withdraw(double amount) {
		if (amount < this.getBalance()) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean pay(double amount) {
		return this.withdraw(amount);
	}
}
