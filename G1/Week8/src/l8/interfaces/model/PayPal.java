package l8.interfaces.model;

public class PayPal extends Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("PayPal");
		return super.pay(amount);
	}

}
