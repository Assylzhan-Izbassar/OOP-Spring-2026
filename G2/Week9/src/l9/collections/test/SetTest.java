package l9.collections.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import l9.collections.model.Product;

public class SetTest {

	public static void main(String[] args) {
		Comparator<Product> productPriceComp = (o1, o2) -> {return Double.compare(o1.getPrice(), o2.getPrice());};
		Set<Product> products = new TreeSet<Product>(productPriceComp);
		
		products.add(new Product("Juice", 300));
		products.add(new Product("Orange", 500));
		products.add(new Product("Apple", 400));
		products.add(new Product("Apple", 500));
		products.add(new Product("Apple", 400));
		products.add(new Product("Milk", 1000));
		
		
		for (Product p: products) {
			System.out.println(p);
		}

	}

}
