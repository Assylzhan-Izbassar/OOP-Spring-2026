package l8.interfaces.model;

public class CreditCard extends Payment {
	@Override
	public boolean pay(double amount) {
		System.out.println("CreditCard");
		return super.pay(amount);
	}

}
