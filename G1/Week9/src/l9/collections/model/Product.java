package l9.collections.model;

import java.util.Objects;

public class Product implements Comparable<Product> {
//public class Product {
	private String name;

	private double price;
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(String name, double price) {
		this(name);
		this.setPrice(price);
	}
	
	@Override
	public boolean equals(Object o) {
		if (super.equals(o)) return true;
		
		if (o == null || !this.getClass().equals(o.getClass())) return false;
		
		Product p = (Product) o;
		return this.name.equals(p.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name); 
	}
	
	@Override
	public int compareTo(Product p) {
		return -this.name.compareToIgnoreCase(p.name);
	}
	
	@Override
	public String toString() {
		return this.name + ", price: " + this.price + " KZT.";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
