package l9.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		products.add("TV");
		products.add("Phone");
		products.add("Mixer");
		
		for (int i=0; i < products.size(); ++i) {
			System.out.println(products.get(i));
		}
		
		for (String product: products) {
			System.out.println(product);
		}
	}

}
