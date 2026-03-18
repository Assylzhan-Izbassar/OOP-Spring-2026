package l9.collections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	
	private static void loopWithIter(Collection<String> coll) {
		Iterator<String> it = coll.iterator();
		
		while (it.hasNext()) {
			String temp = it.next();
			
			if (temp.equals("Phone")) {
				it.remove();
			}
			
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		products.add("TV");
		products.add("Phone");
		products.add("Iron");
		
		products.set(2, "Iron-v2");
		
		
		System.out.println(products.contains("Phone"));
		
		loopWithIter(products);
		
		System.out.println();
		
		for (String s: products) {
			System.out.println(s);
		}
	}

}
