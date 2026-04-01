package l11.exceptions.test;

import l11.exceptions.model.Product;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		Throwable t;
		Exception e; // checked
		RuntimeException re; // run-time
		
		Product p = new Product("YoLO");
		try {
//			Product p2 = API.getProduct();
			Product p2 = null;
			if (p2.getPrice() > 1000) {
				System.out.println(p.getPrice());
			} else {
				System.out.println("Lowered price!");
			}
		} catch (NullPointerException ex) {
			System.err.println("The null happened!"); 
			System.err.println(ex.getMessage());
		}
	}

}
