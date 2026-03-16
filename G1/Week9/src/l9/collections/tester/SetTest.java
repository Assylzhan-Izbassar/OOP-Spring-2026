package l9.collections.tester;

import java.util.Set;
import java.util.TreeSet;

import l9.collections.helpers.ProductPriceComparator;
import l9.collections.model.Product;

public class SetTest {

	public static void main(String[] args) {
		Set<Product> productSet = new TreeSet<Product>(new ProductPriceComparator());
		productSet.add(new Product("TV", 500000)); 
		productSet.add(new Product("TV", 450000));
		productSet.add(new Product("Mixer", 40000));
		productSet.add(new Product("Phone", 350000));
		productSet.add(new Product("Phone", 250000));
		
		for (Product p: productSet) {
			System.out.println(p);
		}

	}

}
