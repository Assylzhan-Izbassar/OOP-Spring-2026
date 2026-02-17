package kz.bank.model;

import java.util.Objects;

public abstract class Account {
	private final String accId;
	private double balance;
	
	public Account(String accId) {
		this.accId = accId;
	}
	
	public Account(String accId, double balance) {
		this(accId);
		this.balance = balance;
	}
	
	public String getAccId() {
		return accId;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double value) {
		if (value > 0) {
			this.balance += value;
			return true;
		}
		return false;
	}
	
	public boolean withdraw(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}
	
	public abstract void paymentMonthly();
	
	public final boolean transfer(Account other, double amount) {
		boolean result = this.withdraw(amount);
		if (result) {
			other.deposit(amount);
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getAccId());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || !(o instanceof Account)) return false;
		
		Account temp = (Account) o;
		
		return this.getAccId().equals(temp.getAccId());
	}
}
