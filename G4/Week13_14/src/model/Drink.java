package model;

public abstract class Drink {
	public abstract double cost();
	public abstract String description();
	
	@Override
	public String toString() {
//		return description() + ": " + cost() + " KZT.";  
		return description();  
	}
}
