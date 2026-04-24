package pattern;

import model.Drink;
import model.IDrink;

public abstract class DrinkDecorator extends Drink {
	protected IDrink drink;
	
	public DrinkDecorator(IDrink drink) {
		this.drink = drink;
	}
	
	@Override
	public String toString()  {
		return this.description();
	}
}
