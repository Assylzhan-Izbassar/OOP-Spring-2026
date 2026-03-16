package l9.collections.helpers;

import java.util.Comparator;

import l9.collections.model.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName()) + Double.compare(o1.getPrice(), o2.getPrice());
	}

}
