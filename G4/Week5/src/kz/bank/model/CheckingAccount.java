package kz.bank.model;

public class CheckingAccount extends Account {
	private static double transactionFee;
	private static double monthlyFee;
	
	{
		transactionFee = 200;
		monthlyFee = 150;
	}
	
	public CheckingAccount(String accID) {
		super(accID);
	}

	@Override
	public void processMonthly() {
		this.withdraw(monthlyFee);
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (this.getBalance() + transactionFee < amount) {
			return false;
		}
		super.withdraw(amount + transactionFee);
		return true;
	}

	public static double getTransactionFee() {
		return transactionFee;
	}

	public static double getMonthlyFee() {
		return monthlyFee;
	}

}
