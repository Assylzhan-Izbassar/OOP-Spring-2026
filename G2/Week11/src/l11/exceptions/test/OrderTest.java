package l11.exceptions.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import l11.exceptions.model.Product;
import l11.exceptions.service.OrderService;

public class OrderTest {

	public static void main(String[] args) {
		Product p1 = new Product("Mixer", 45000.0, 50);
		Product p2 = new Product("Air-iron", 25000.0);
		Product p3 = new Product("TV", 450000.0, 10);
		
		List<Product> cart = new ArrayList<Product>();
		cart.add(p1);
		cart.add(p2);
		cart.add(p3);
		
		OrderService os = new OrderService();
		Map.Entry<List<Product>, Boolean> result = os.order(cart);
		System.out.println(result);
	}

}
