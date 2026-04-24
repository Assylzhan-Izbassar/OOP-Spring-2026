package pattern;

import model.Coffee;
import model.DrinkType;
import model.IDrink;
import model.Tea;

public class DrinkFactory {
	public static IDrink createDrink(DrinkType type) {
		switch (type) {
		case DrinkType.TEA:
			return new Tea();
		case DrinkType.COFFEE:
			return new Coffee();
		default:
			throw new IllegalArgumentException("Not supported drink!");
		}
	}
}
