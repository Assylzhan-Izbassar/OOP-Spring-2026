package kz.bank.model;

// SOLID
// S - Single Responsibility Principle
// L - Liskov Substitution Principle

public abstract class Account {
	private String accId;
	private double balance = 0.0;
	
	public Account() {}
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public abstract boolean paymentMonthly();
	
	public boolean withdraw(double money) { 
		if (this.balance >= money) {
			this.balance -= money;
			return true;
		}
		return false;
	}
	
	public void deposit(double money) {
		this.balance += money;
	}
	
//	public final abstract void transfer(); ! WRONG
	
	public final boolean payment(Account other, double money) {
		boolean result = this.withdraw(money);
		if (result) 
			other.deposit(money);
		return result;
	}
}
