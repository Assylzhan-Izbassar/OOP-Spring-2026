package kz.bank.model;

import java.util.Objects;

public class SavingAccount extends Account {
	private double interest;
	
	public SavingAccount(double interest) {
		this.interest = interest;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(interest);
//		return (int) interest;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof SavingAccount) || o == null) return false;
		
		SavingAccount temp = (SavingAccount) o;
		return this.interest == temp.interest; 
	}
	
	@Override
	public boolean paymentMonthly() {
		this.deposit(interest * this.getBalance());
		return true;
	}

}
