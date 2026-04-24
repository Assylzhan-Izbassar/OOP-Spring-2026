package pattern;

import model.Drink;

public class SugarDecorator extends DrinkDecorator {

	public SugarDecorator(Drink drink) {
		super(drink);
	}

	@Override
	public double cost() {
		return drink.cost() + 50;
	}

	@Override
	public String description() {
		return drink.description() + ", with Sugar";
	}

}
