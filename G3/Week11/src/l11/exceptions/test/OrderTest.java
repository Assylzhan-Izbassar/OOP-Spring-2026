package l11.exceptions.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import l11.exceptions.exception.InvalidOrderException;
import l11.exceptions.model.Product;
import l11.exceptions.service.OrderService;

public class OrderTest {

	public static void main(String[] args) {
		OrderService os = new OrderService();
		
		List<Product> cart = new ArrayList<Product>();
		cart.add(new Product("Mixer", 45000.0, 50));
		cart.add(new Product("TV", 450000.0, 10));
		cart.add(new Product("Labubu", 15000.0));
		
		try {
			Map.Entry<List<Product>, Boolean> result = os.order(cart);
			System.out.println(result);
		} catch (NullPointerException np) {
			System.err.println(np.getMessage());
		}
	}

}
