package model;

public class Coffee extends Drink {

	@Override
	public double cost() {
		return 1000;
	}

	@Override
	public String description() {
		return "Coffee";
	}

}
