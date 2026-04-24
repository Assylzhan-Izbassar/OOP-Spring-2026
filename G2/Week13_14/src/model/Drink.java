package model;

public abstract class Drink implements IDrink, Cloneable {
	@Override
	public String toString() {
		return this.description();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
