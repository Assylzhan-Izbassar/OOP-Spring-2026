package pattern;

import model.Coffee;
import model.Drink;
import model.DrinkType;
import model.Tea;

public class DrinkFactory {
	public static Drink getDrink(DrinkType type) throws IllegalArgumentException {
		switch(type) {
		case DrinkType.COFFEE:
			return new Coffee();
		case DrinkType.TEA:
			return new Tea();
		default:
			throw new IllegalArgumentException("Cannot find that type!");
		}
	}
}
