package l9.collections.tester;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import l9.collections.model.Product;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Product> products = new LinkedList<Product>();
		
		products.add(new Product("TV"));
		products.addLast(new Product("Mouse"));
		products.add(new Product("Phone"));
		products.add(new Product("Laptop"));
		products.addFirst(new Product("Mixer"));
		
		for (Product p: products) {
			System.out.println(p);
		}
		
		Queue<Product> q;
		
		
		Stack<Product> st;

	}

}
