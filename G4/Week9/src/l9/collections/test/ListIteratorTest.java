package l9.collections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListIteratorTest {
	
	public static void processList(List<String> products) {
		Iterator<String> it = products.iterator();
		
		while (it.hasNext()) {
			String value = it.next();
			if (value.equals("TV")) {
				products.set(2, "Changed");
			}
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		products.add("TV");
		products.add("Phone");
		products.add("Mixer");
		
		processList(products);
		
//		for (int i=0; i < products.size(); ++i) {
//			System.out.println(products.get(i));
//		}
//		
//		for (String product: products) {
//			System.out.println(product);
//		}
	}

}
