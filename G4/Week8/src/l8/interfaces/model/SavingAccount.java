package l8.interfaces.model;

public class SavingAccount extends Account {

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		if (this.balance > amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}

}
