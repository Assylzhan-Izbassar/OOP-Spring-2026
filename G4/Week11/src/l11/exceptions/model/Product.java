package l11.exceptions.model;

public class Product {
	private String name;
	private Double price;
	
	{
		price = 0.0;
	}
	
	public Product(String name) {
		this.setName(name);
	}
	
	public Product(String name, Double price) {
		this(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
