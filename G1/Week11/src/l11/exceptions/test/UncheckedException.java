package l11.exceptions.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import l11.exceptions.model.Product;

public class UncheckedException {

	public static void main(String[] args) {
		Product p = new Product("TV");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String data = br.readLine();
			try {
				p.doSmth(Double.parseDouble(data));
			} catch (IllegalArgumentException e) {
				System.err.println("Illegal argument when were inputing some data!");
			}
			
			// ... we can continue to work with outer `try` block.			
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (IOException io) { 
			io.printStackTrace();
		} 
//		catch (IllegalArgumentException e) {
//			System.err.println("Illegal argument when were inputing some data!");
//		} 
//		finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		System.out.println("Other code execution...");

	}

}
