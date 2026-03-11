package l8.interfaces.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import l8.interfaces.helper.ProductRatingComparator;
import l8.interfaces.model.Product;

public class ProductTester {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		
		Comparator<Product> productRatingComparator = (o1, o2) -> {
			return Double.compare(o1.getRating(), o2.getRating());
			};
		
		Product p1 = new Product("TV", 500000);
		Product p2 = new Product("Mixer", 80000);
		Product p3 = new Product("Phone", 200000);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		p1.setRating(4.8);
		p2.setRating(4.5);
		p3.setRating(4.9);
		
		for (Product p: products) {
			System.out.println(p);
		}
		
		products.sort(productRatingComparator);
		
		System.out.println("\nSorted:");
		for (Product p: products) {
			System.out.println(p);
		}

	}

}
