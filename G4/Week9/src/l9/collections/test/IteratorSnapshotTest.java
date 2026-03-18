package l9.collections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class IteratorSnapshotTest {
	
	public static void processList(List<String> products) {
		
		ListIterator<String> it = products.listIterator();
		System.out.println(it);
		
		if (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
		
		products.add("New Product");
		
		System.out.println(it);
		
		it = products.listIterator();
		System.out.println(it.hasNext());
		
		while (it.hasNext()) {
			String value = it.next();
			if (value.equals("TV")) {
				products.set(2, "Changed");
			}
			System.out.println(value);
		}
		
		products.add("New Product");
		
		System.out.println(it);
		System.out.println(it.hasNext());
		System.out.println(it.next());
	}

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		products.add("TV");
		products.add("Phone");
		products.add("Mixer");
		
		processList(products);
		
		for (String product: products) {
			System.out.println(product);
		}
	}

}
