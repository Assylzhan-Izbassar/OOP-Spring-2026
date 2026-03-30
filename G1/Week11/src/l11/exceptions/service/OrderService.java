package l11.exceptions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import l11.exceptions.expection.InvalidOrderException;
import l11.exceptions.model.Product;

public class OrderService {
	public Map.Entry<Boolean, List<Product>> buy(List<Product> products) throws InvalidOrderException {
		List<Product> validProducts = new ArrayList<Product>();
		for (Product p: products) {
			try {
				if (p.getStockCnt() < 0) {
					throw new InvalidOrderException("We don't have the product: " + p);
				}
				validProducts.add(p);
			} catch (InvalidOrderException e) {
				System.err.println(e.getMessage());
			}
		}
		if (validProducts.isEmpty()) {
			return Map.entry(false, validProducts);
		}
		return Map.entry(true, validProducts);
	}
}
