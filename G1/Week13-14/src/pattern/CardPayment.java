package pattern;

public class CardPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Paying with card: " + amount + " KZT.");
	}
}
