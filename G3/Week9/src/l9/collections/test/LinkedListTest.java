package l9.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		
		Collections.sort(ll);
		
		ArrayList<String> arrList;
		Vector<String> vector;
		
		ll.add("Orange");
		ll.add("Apple");
		ll.addFirst("Pineapple");
		ll.add("Juice");
		
		ListIterator<String> li = ll.listIterator();
		while (li.hasNext()) {
			String temp = li.next();
			System.out.println(temp);
		}

	}

}
