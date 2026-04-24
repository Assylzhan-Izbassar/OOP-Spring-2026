package model;

public class Coffee implements IDrink {

	@Override
	public double cost() {
		return 750;
	}

	@Override
	public String description() {
		return "Coffee";
	}
	
	@Override
	public String toString() {
		return this.description();
	}
}
