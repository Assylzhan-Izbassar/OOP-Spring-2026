package l9.collections.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	
	private static void loopWithIter(List<String> coll) {
		ListIterator<String> it = coll.listIterator();
	 
		while (it.hasNext()) {
			String temp = it.next();
			
			if (temp.equals("Phone")) {
				it.remove();
				it.previous();
			}
			
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		products.add("TV");
		products.add("Phone");
		products.add("Iron");
		
		loopWithIter(products);
		
		System.out.println();
		
		for (String s: products) {
			System.out.println(s);
		}
	}

}
