package l9.collections.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraverseTest {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		
		
		products.add("TV");
		products.add("Phone");
		products.add("Iron");
		
		for (int i=0; i < products.size(); ++i) {
			System.out.println(products.get(i));
		}

		Set<String> productSet = new HashSet<String>();
		
		productSet.add("TV");
		productSet.add("Phone");
		productSet.add("Iron");
		
		Object[] productArr = productSet.toArray();
		
		for (int i=0; i < productSet.size(); ++i) {
			System.out.println(productArr[i]);
		}
	}

}
