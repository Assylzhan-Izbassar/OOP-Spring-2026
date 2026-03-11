package l8.interfaces.model;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	private String description;
	private double rating;
	
	private static int productCnt = 0;
	
	{
		productCnt++;
		this.id = productCnt;
	}
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Product other) {
		if (this.getPrice() > other.getPrice()) {
			return 1;
		} else if (this.getPrice() < other.getPrice()) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}
