package kz.bank.model;

public class CheckingAccount extends Account {
	private final double fee;
	
	public CheckingAccount(String accId, double fee) {
		super(accId);
		this.fee = fee;
	}
	
	public double getFee() {
		return fee;
	}

	@Override
	public void paymentMonthly() {
		this.withdraw(fee);
	}
}
