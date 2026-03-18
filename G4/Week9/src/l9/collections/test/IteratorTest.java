package l9.collections.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
	
	public static void processList(List<String> products) {
		ListIterator<String> it = products.listIterator();
		
		while (it.hasPrevious()) {
			String value = it.previous();

			System.out.println(value);
		}
		
		while (it.hasNext()) {
			String value = it.next();
			if (value.equals("TV")) {
				products.set(2, "Changed");
//				it.previous();
			}
			System.out.println(value);
			
			if (it.hasPrevious()) {
				System.out.println("Previous: " + value);
			}
		}
	}

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		products.add("TV");
		products.add("Phone");
		products.add("Mixer");
		
		processList(products);
	}

}
