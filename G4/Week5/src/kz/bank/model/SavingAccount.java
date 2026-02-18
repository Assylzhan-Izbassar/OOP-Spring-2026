package kz.bank.model;

public final class SavingAccount extends Account {

	private static double interestRate;
	
	{
		interestRate = 1.4;
	}
	
	public SavingAccount(String accID) {
		super(accID);
//		this.setAccID(accID);
	}
	
	public static double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public void processMonthly() {
		double interest = this.getBalance() * interestRate / 100;
		this.deposit(interest);
	}
	
//	@Override
//	public final boolean transaction(Account other, double amount) {
//		
//	}
	
}
