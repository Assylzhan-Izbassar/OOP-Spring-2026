package pattern;

import model.Drink;

public class DrinkMilkDecorator extends DrinkDecorator {

	public DrinkMilkDecorator(Drink drink) {
		super(drink);
	}

	@Override
	public double cost() {
		return drink.cost() + 100;
	}

	@Override
	public String description() {
		return drink.description() + ", with Milk";
	}

}
