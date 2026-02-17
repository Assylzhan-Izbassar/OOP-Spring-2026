package kz.bank.model;

public final class SavingAccount extends Account {
	private double interest;
	
	public SavingAccount(String accId, double interest) {
		super(accId);
		this.interest = interest;
	}
	
	public double getInterest() {
		return this.interest;
	}

	@Override
	public void paymentMonthly() {
		double interestBalance = this.getBalance() * this.interest;
		System.out.println("Interest: " + interestBalance);
		this.deposit(interestBalance);
	}
}
