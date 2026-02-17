package kz.bank.model;

public class CheckingAccount extends Account {
	private static double transferFee;
	private static double monthlyFee;
	
	{
		CheckingAccount.transferFee = 200;
		CheckingAccount.monthlyFee = 150;
	}
	
	public CheckingAccount(String accId) {
		super(accId);
	}
	
	public static double getTransferFee() {
		return transferFee;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if (this.getBalance() < amount + transferFee) { 
			return false; 
		}
		super.withdraw(amount);
		this.withdraw(transferFee);
		return true;
	}

	@Override
	public void processMonthly() {
		this.withdraw(monthlyFee);
	}
}
