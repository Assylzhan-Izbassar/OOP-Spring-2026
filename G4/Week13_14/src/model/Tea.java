package model;

public class Tea extends Drink {

	@Override
	public double cost() {
		return 350;
	}

	@Override
	public String description() {
		return "Tea";
	}

}
