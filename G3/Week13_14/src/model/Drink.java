package model;

public abstract class Drink {
//	List<Extra> extra;
	
	public abstract double cost();
	public abstract String description();
	
	@Override
	public String toString() {
		return this.description() + " - " + this.cost() + " KZT"; 
	}
}
