package l9.collections.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import l9.collections.model.Product;

public class MapTest {

	public static void main(String[] args) {
		Map<Product, Integer> productMap = new HashMap<Product, Integer>();
		
		productMap.put(new Product("TV", 200000), 10);
		productMap.put(new Product("Phone", 350000), 20);
		productMap.put(new Product("Phone", 250000), 10);
		productMap.put(new Product("Mixer", 40000), 50);
		
//		m[item]++;
		
		for (Product p: productMap.keySet()) {
			System.out.println(p);
			System.out.println(productMap.get(p));
		}
		
//		for (Integer i: productMap.values()) {
//			System.out.println(i);
//		}

	}

}
