package l9.collections.tester;

import java.util.HashMap;

import l9.collections.model.Product;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Product, Integer> products = new HashMap<Product, Integer>();
		products.put(new Product("TV"), 3);
		products.put(new Product("Phone"), 10);
		products.put(new Product("Iron"), 5);
		
		for (Product p: products.keySet()) {
			System.out.println(p);
		}
		
		for (Integer p: products.values()) {
			System.out.println(p);
		}
		
		
		
	}

}
