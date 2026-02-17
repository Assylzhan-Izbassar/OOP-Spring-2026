package kz.bank.model;

public final class SavingAccount extends Account {

	private double interestRate;
	
	public SavingAccount(String accId, double interestRate) {
		super(accId);
		this.interestRate = interestRate;
	}
		
	public double getInterestRate() {
		return this.interestRate;
	}

	@Override
	public void processMonthly() {
		double interest = this.getBalance() * this.interestRate;
		this.deposit(interest);
	}

}
