package l9.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SnapshotTest {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		products.add("TV");
		products.add("Phone");
		products.add("Iron");
		
		Iterator<String> it = products.iterator();
				
		products.add("Mixer");
		while (it.hasNext()) {
			String temp = it.next();
			if (temp.equals("TV")) {
				products.set(2, "Changed!");
			}
			System.out.println(temp);
		}
		
		
		for (String s: products) {
			System.out.println(s);
		}

	}

}
