package l8.interfaces.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import l8.interfaces.helper.ProductRatingComparator;
import l8.interfaces.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		
		Product p1 = new Product("Laptop", 700000);
		Product p2 = new Product("Iron", 4000000);
		Product p3 = new Product("TV", 250000);
		Product p4 = new Product("Apple", 1000);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		p1.setRating(4.6);
		p2.setRating(4.3);
		p3.setRating(4.8);
		p4.setRating(4.4);
	
		
		for (Product p: products) {
			System.out.println(p);
		}
		
		Comparator<Product> productRatingComp = (o1, o2) -> {
			return Double.compare(o1.getRating(), o2.getRating());
		};
		
		Comparator<Product> productNameComp = (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		}; // lambda expression
		
		products.sort(new ProductRatingComparator());
		
		System.out.println("\nSorted:");
		
		for (Product p: products) {
			System.out.println(p);
		}
	}

}
