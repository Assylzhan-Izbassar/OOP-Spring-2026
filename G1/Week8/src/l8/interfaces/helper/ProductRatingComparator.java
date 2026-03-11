package l8.interfaces.helper;

import java.util.Comparator;

import l8.interfaces.model.Product;

public class ProductRatingComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getRating() < o2.getRating()) {
			return 1;
		} else if (o1.getRating() > o2.getRating()) {
			return -1;
		}
		return 0;
	}

}
