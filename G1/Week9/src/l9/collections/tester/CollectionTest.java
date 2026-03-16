package l9.collections.tester;

import java.util.ArrayList;
import java.util.Collection;

import l9.collections.model.Product;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<Product> products = new ArrayList<Product>();
		Product p = new Product("TV"); 
		Product p2 = new Product("TV"); 
		Product p3 = new Product("Phone"); 
		
		products.add(p2);
		products.add(p3);
		
		System.out.println(products.contains(p));
		
		String s = new String("Test");
		Double s2 = 4.3;
		System.out.println(s.getClass().equals(s2.getClass()));
	}

}
