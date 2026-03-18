package l9.collections.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		
		Vector<String> vf = new Vector<String>();
		ArrayList<String> af = new ArrayList<String>();
		
		ll.add("Apple");
		ll.add("Orange");
		ll.add("Pineapple");
		
		ll.addFirst("Limon");
		
		ListIterator<String> li = ll.listIterator();
		
		int cnt = 0;
		while (li.hasNext()) {
			String fruit = li.next();
			if (fruit.equals("Orange") && cnt == 0) {
				String prevFruit = li.previous();
				System.out.println(prevFruit);
				cnt++;
			}
			System.out.println(fruit);
		}

	}

}
