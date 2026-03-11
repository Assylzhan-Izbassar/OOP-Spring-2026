package l8.interfaces.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import l8.interfaces.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		
		Product p1 = new Product("Iron", 45000);
		Product p2 = new Product("TV", 550000);
		Product p3 = new Product("Mixer", 30000);
		
		p1.setRating(4.75);
		p2.setRating(4.9);
		p3.setRating(4.5);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		for (Product p: products) {
			System.out.println(p);
		}
		
		Comparator<Product> productByRating = (o1, o2) -> {
			return Double.compare(o1.getRating(), o2.getRating());
			};
		
//		Collections.sort(products, null);
		products.sort(productByRating);
		
		System.out.println("\nSorted:");
		for (Product p: products) {
			System.out.println(p);
		}

	}

}
