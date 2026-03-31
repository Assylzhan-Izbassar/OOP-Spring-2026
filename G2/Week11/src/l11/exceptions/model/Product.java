package l11.exceptions.model;

public class Product {
	private String name;
	private Double price;
	private Integer prodCnt;
	
	{
		price = 0.0;
		prodCnt = 0;
	}
	
	public Product(String name, Double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	public Product(String name, Double price, Integer prodCnt) {
		this(name, price);
		this.setProdCnt(prodCnt);
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

	public Integer getProdCnt() {
		return prodCnt;
	}

	public void setProdCnt(Integer prodCnt) {
		this.prodCnt = prodCnt;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
