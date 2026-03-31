package l11.exceptions.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import l11.exceptions.exception.InvalidOrderException;
import l11.exceptions.model.Product;

public class OrderService {
	public Map.Entry<List<Product>, Boolean> order(List<Product> cart) throws InvalidOrderException, NullPointerException {
		List<Product> validProducts = new ArrayList<Product>();
		for (Product p: cart) {
			try {
				if (p.getProdCnt() <= 0.0) {
					throw new InvalidOrderException("The product " + p + " is out-of-stock!");
				} else { 
					validProducts.add(p);
				}
			} catch (InvalidOrderException invalidOrder) {
				
				System.err.println(invalidOrder.getMessage());
			}
		}
		Boolean result = true;
		if (validProducts.isEmpty()) {
			result = false; 
		}
		return Map.entry(validProducts, result);
	}
}
