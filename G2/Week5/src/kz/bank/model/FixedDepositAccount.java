package kz.bank.model;

public class FixedDepositAccount extends Account {

	public FixedDepositAccount(String accId) {
		super(accId);
	}
	
	@Override
	public boolean withdraw(double amount) {
		return false;
	}

	@Override
	public void paymentMonthly() {		
	}

}
