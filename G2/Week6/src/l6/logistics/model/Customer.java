package l6.logistics.model;

public class Customer {
	private String fullName;
	
	public Customer(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}
	
	@Override
	public String toString() {
		return "Customer: " + this.getFullName();
	}
	
}
