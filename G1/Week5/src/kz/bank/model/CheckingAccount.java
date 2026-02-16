package kz.bank.model;

public class CheckingAccount extends Account {
	private double fee;
	
	public CheckingAccount(double fee) {
		this.fee = fee;
	}
	
	public CheckingAccount(double balance, double fee) {
		this(fee);
		super.deposit(balance);
	}
	
	@Override
	public void deposit(double money) {
		super.deposit(money);
		this.withdraw(fee * 0.1);
	}
	
	@Override
	public boolean paymentMonthly() {
		this.withdraw(fee);
		return true;
	}
}
