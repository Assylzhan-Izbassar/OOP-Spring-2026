package l9.collections.model;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;

	private double price; 
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getName(), this.getPrice());
	}
	
	@Override
	public boolean equals(Object o) {
		if (super.equals(o)) return true; // this == o
		if (o == null || !(o instanceof Product)) return false;
		
		Product p = (Product) o;
		return p.getName().equals(this.getName()) && p.getPrice() == this.getPrice();
	}

	
	@Override
	public String toString() {
		return this.getName() + " with price: " + this.getPrice() + " KZT.";
	}

	@Override
	public int compareTo(Product o) {
		return this.getName().compareTo(o.getName()) + Double.compare(o.getPrice(), this.getPrice());
	}
}
