package kz.bank.model;

import java.util.Objects;

public abstract class Account {
	private String accID;
	private double balance;
	
//	public Account() {
//		
//	}
		
	public Account(String accID) { 
		this.accID = accID;
	}
	
//	public void setAccID(String accID) {
//		this.accID = accID;
//	}

	public String getAccID() {
		return this.accID;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public boolean withdraw(double amount) {
		if (this.getBalance() >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}
	
	public final boolean transaction(Account other, double amount) {
		boolean result = this.withdraw(amount);
		if (result) {
			other.deposit(amount);
			return true;
		}
		return false;
	}
	
	public abstract void processMonthly();
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getAccID());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null || !(o instanceof Account)) return false;
		
		Account account = (Account) o; // narrowing
		return this.getAccID().equals(account.getAccID());
	}
}
