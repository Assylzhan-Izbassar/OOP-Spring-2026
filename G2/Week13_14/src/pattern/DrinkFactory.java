package pattern;

import model.Coffee;
import model.DrinkType;
import model.IDrink;
import model.Tea;

public class DrinkFactory {
	public static IDrink getDrink(DrinkType type) {
		switch(type) {
		case DrinkType.COFFEE:
			return new Coffee();
		case DrinkType.TEA:
			return new Tea();
		default:
			return null;
		}
	}
}
