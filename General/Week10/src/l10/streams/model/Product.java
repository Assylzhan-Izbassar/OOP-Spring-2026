package l10.streams.model;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 5565883254704779954L;
	
	private String name;
	private transient double price;
	
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
	
	
	@Override
	public String toString() {
		return this.getName() + " with price: " + this.getPrice();
	}
	
}
