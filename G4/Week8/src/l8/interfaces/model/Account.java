package l8.interfaces.model;

public abstract class Account {
	protected double balance;

	public double getBalance() {
		return balance;
	}

	public abstract boolean deposit(double amount);
	
	public abstract boolean withdraw(double amount);
}
