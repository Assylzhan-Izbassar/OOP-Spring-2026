package l6.logistic.model;

public class Customer {
	private String fullName;
	
	public Customer(String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String toString() {
		return "Customer: " + this.fullName;
	}
}
