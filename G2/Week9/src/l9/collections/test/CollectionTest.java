package l9.collections.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import l9.collections.model.Product;

public class CollectionTest {
	
	public static void removeLongString(Collection<String> words, int maxLen) {
		Iterator<String> it = words.iterator();
		
		ListIterator<String> it2 = ((List<String>) words).listIterator();
		
		System.out.println(it2.hasPrevious());
		System.out.println(it2.hasNext());
		
		while (it.hasNext()) {
			String temp = it.next();
			if (temp.length() > maxLen) {
				it.remove();
			}
		}
	}

	public static void main(String[] args) {
		Collection c;
		
		Map<Object, Object> m; 
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("TV"));
		products.add(new Product("Mixer"));
		products.add(new Product("Phone"));
		
		for (Product p: products) {			
			System.out.println(p);
		}
		
		Collection<String> words = new ArrayList<String>();
		words.add("eggs");
		words.add("milk");
		words.add("breakfast");
		words.add("mountain");
		
		System.out.println();

		
		for (String word: words) {
			System.out.println(word);
		}
		
		removeLongString(words, 5);
		
		System.out.println();
		
		for (String word: words) {
			System.out.println(word);
		}
	}

}
