package l7.interfaces.model;

public interface Payment {
	double TAX_RATE = 0.1;
	
	void pay(double amount);
	
	default void printCheck() {
		System.out.println("Print check");
	}
	
	static void validate(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("Value have to be positive!");
		}
	}
}
