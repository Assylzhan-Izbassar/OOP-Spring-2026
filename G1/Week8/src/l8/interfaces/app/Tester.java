package l8.interfaces.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import l8.interfaces.model.Checkout;
import l8.interfaces.model.PayPal;
import l8.interfaces.model.Product;
import l8.interfaces.service.PaymentProcessor;

public class Tester {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		
		Product p1 = new Product("MacBook M1", 1900);
		Product p2 = new Product("iPhone 16", 1200);
		
		int result = p1.compareTo(p2);
		
		if (result == 1) {
			System.out.println(p1 + " is greater than " + p2);
		} else if (result == -1) {
			System.out.println(p1 + " is less than " + p2);
		} else {
			System.out.println(p1 + " is equal to " + p2);
		}
		
		products.add(p1);
		products.add(p2);
		products.add(new Product("TV", 2400));
		products.add(new Product("Toster", 80));
		
		for (Product p: products) {
			System.out.println(p);
		}
		
		p1.setRating(4.5);
		p2.setRating(5);
		
		System.out.println("\nSorted:");
		
		// lambda expressions
		Comparator<Product> productRatingComp = (o1, o2) -> {return o1.compareTo(o2); };
		
		products.sort(productRatingComp);
		
		for (Product p: products) {
			System.out.println(p);
		}
		
		
		PaymentProcessor pp = new PaymentProcessor();
		Checkout checkout = new Checkout();
		checkout.setPaymentMethod(new PayPal());
		
		boolean response = pp.process(checkout, 1000);
		
		System.out.print(response);
		
	}

}
