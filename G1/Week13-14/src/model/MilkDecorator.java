package model;

import pattern.DrinkDecorator;

public class MilkDecorator extends DrinkDecorator {

	public MilkDecorator(IDrink drink) {
		super(drink);
	}

	@Override
	public double cost() {
		return drink.cost() + 100;
	}

	@Override
	public String description() {
		return drink.description() + ", Milk";
	}
	
	@Override
	public String toString() {
		return this.description();
	}

}
