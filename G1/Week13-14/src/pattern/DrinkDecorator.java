package pattern;

import model.IDrink;

public abstract class DrinkDecorator implements IDrink {
	protected IDrink drink;
	
	public DrinkDecorator(IDrink drink) {
		this.drink = drink;
	}
}
