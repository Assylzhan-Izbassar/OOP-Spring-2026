package l8.interfaces.model;

public class Product implements Comparable<Product> {
	private String name;
	private double price;
	private double rating;
	
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else if (o == null || !(o.getClass().equals(this.getClass()))) {
			return false;
		}
		Product p = (Product) o;
		return p.getName().equals(this.getName());
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

	@Override
	public int compareTo(Product o) {
//		return this.getName().compareTo(o.getName());
				
		if (this.getPrice() > o.getPrice()) {
			return -1;
		} else if (this.getPrice() < o.getPrice()) {
			return 1;
		}
		return 0;
		
//		return Double.compare(this.getPrice(), o.getPrice());
	}
	
}
