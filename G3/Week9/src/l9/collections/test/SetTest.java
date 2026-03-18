package l9.collections.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import l9.collections.model.Product;

public class SetTest {

	public static void main(String[] args) {
		Comparator<Product> productPriceComp = (o1, o2) -> {
			return -Double.compare(o1.getPrice(), o2.getPrice());
		};
		
		Comparable c;
		
		Set<Product> productSet = new TreeSet<Product>(productPriceComp);
		
		productSet.add(new Product("TV", 200000));
		productSet.add(new Product("Phone", 350000));
		productSet.add(new Product("Phone", 350000));
		productSet.add(new Product("Phone", 350000));
		productSet.add(new Product("Iron", 40000));
		
		for (Product p: productSet) {
			System.out.println(p);
		}

	}

}
