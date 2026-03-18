package l9.collections.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		products.add("TV");
		products.add("Phone");
		products.add("Iron");
		
		products.set(2, "Iron-v2");
		
		System.out.println(products.contains("Phone"));
		
		for (String s: products) {
			System.out.println(s);
		}
	}

}
