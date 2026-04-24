package model;

public class Tea implements IDrink {

	@Override
	public double cost() {
		return 300;
	}

	@Override
	public String description() {
		return "Tea";
	}
	
	@Override
	public String toString() {
		return this.description();
	}

}
