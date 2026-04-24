package pattern;

public class CashPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Paying with cash: " + amount + " KZT.");
	}

}
