package l9.collections.model;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private double price;
	
	public Product(String name) {
		this.setName(name);
	}
	
	public Product(String name, double price) {
		this(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (super.equals(o)) return true;
		if (o == null && !(o instanceof Product)) return false;
		
		Product p = (Product) o;
		return this.getName().equals(p.getName());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getName());
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	

	@Override
	public int compareTo(Product o) {
		return this.getName().compareTo(o.getName());
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
