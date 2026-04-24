package pattern;

import model.Drink;

public abstract class DrinkDecorator extends Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}
