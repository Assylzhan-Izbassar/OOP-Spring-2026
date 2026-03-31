package l11.exceptions.model;

public class Product {
	private String name;
	private Double price;
	private Integer stockCnt;
	
	{
		this.price = 0.0;
		this.stockCnt = 0;
	}
	
	public Product(String name, Double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	public Product(String name, Double price, Integer stockCnt) {
		this(name, price);
		this.setStockCnt(stockCnt);
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

	public Integer getStockCnt() {
		return stockCnt;
	}

	public void setStockCnt(Integer stockCnt) {
		this.stockCnt = stockCnt;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
