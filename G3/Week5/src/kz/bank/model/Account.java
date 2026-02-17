package kz.bank.model;

import java.util.Objects;

/*
 * SOLID
 * S - Single Responsibility Principle
 * L - Liskov Substitution Principle
 * */

public abstract class Account {
	private String accId;
	private double balance;
	
	public Account(String accId) { // constructor 
		this.accId = accId;
	}
	
	public String getAccId() {
		return this.accId;
	}
	
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
		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	
	public abstract void processMonthly();
	
	public final boolean transfer(Account other, double amount) {
		boolean result = this.withdraw(amount);
		if (result) {
			other.deposit(amount);
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getAccId());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true; // addresses
		if (o == null || !(o instanceof Account)) return false; // null && instance
		
		Account temp = (Account) o; // narrowing type casting
		return this.getAccId().equals(temp.getAccId());
	}
}
