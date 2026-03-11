package l8.interfaces.model;

public class Product implements Comparable<Product> {
	private String name;
	private double price;
	private double rating;
	
	public Product(String name, double price) {
		this.setName(name);
		this.setPrice(price);
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	@Override
	public String toString() {
		return this.getName();
	}


	@Override
	public int compareTo(Product o) {
		if (this.getPrice() > o.getPrice()) {
			return -1;
		} else if (this.getPrice() < o.getPrice()) {
			return 1;
		}
		return 0;
	}
}
