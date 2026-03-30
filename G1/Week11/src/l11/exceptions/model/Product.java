package l11.exceptions.model;

public class Product {
	private String name;
	private int stockCnt;
	
	public Product(String name) {
		this.setName(name);
	}
	
	public Product(String name, int stockCnt) {
		this(name);
		this.setStockCnt(stockCnt);
	}
	
	public void doSmth(Double a) {
		System.out.println("Adding...");
	}

	public int getStockCnt() {
		return stockCnt;
	}

	public void setStockCnt(int stockCnt) {
		this.stockCnt = stockCnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
