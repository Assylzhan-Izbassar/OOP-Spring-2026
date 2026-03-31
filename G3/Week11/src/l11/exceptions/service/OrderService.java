package l11.exceptions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import l11.exceptions.exception.InvalidOrderException;
import l11.exceptions.model.Product;

public class OrderService {
	public Map.Entry<List<Product>, Boolean> order(List<Product> cart) throws InvalidOrderException {
		List<Product> valid = new ArrayList<Product>();
		for (Product p: cart) {
			try {
				if (p.getStockCnt() <= 0) {
					throw new InvalidOrderException("The product " + p + " is out-of-stock!");
				} else {
					valid.add(p);
				}
			} catch (InvalidOrderException io) {
				System.err.println(io.getMessage());
			}
		}
		boolean result = valid.isEmpty() ? false : true;
		return Map.entry(valid, result);
	}
}
