package l9.collections.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> p2 = new ArrayList<String>();
		List<String> v = new Vector<String>();
		p2.add(0, null);
		
		List<String> products = new LinkedList<String>();
		
		products.add("Milk");
		products.addFirst("Pineapple");
		products.add("Orange");
		products.add("Apple");
		
//		products.add(6, "Cherry");
		
		for (String p: products) {
			System.out.println(p);
		}
	}

}
