package l9.collections.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
	
	public static void removeLongString(Collection<String> words, int maxLen) {
		Iterator<String> it = words.iterator();
		
		while (it.hasNext()) {
			String temp = it.next();
			
			if (temp.length() < maxLen) {
				it.remove();
			}
		}
	}
	
	public static void checkSnapshot(List<String> numbers) {
		Iterator<String> it = numbers.iterator();
		
		
		while(it.hasNext()) {
			String number = it.next();
			if (number.equals("1")) {
				numbers.set(2, "changed");
			}
			
			System.out.println(number);
		}
		numbers.add("4");
	}

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Kazakhstan");
		words.add("Russia");
		words.add("Kyrgystan");
		
		removeLongString(words, 7);
		
		for (String s: words) {
			System.out.println(s);
		}
		
		
		List<String> numbers = new ArrayList<String>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		
		checkSnapshot(numbers);
		
		for(String n: numbers) { // for-each
			System.out.println(n);
		}
	}

}
