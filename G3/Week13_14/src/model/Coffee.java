package model;

public class Coffee extends Drink {

	@Override
	public double cost() {
		return 1200;
	}

	@Override
	public String description() {
		return "Coffee";
	}

}
