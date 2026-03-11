package l8.interfaces.helper;

import java.util.Comparator;

import l8.interfaces.model.Product;

public class ProductRatingComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return -Double.compare(p1.getRating(), p2.getRating());
	}

}
