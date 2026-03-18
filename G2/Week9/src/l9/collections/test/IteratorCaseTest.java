package l9.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCaseTest {

	public static void main(String[] args) {
		List<String> numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		
		Iterator<String> iter = numbers.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			if (temp.equals("1")) {
				numbers.set(2, "changed");
			}
			System.out.println(temp);
		}
		
	}

}
