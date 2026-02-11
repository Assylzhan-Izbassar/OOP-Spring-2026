package kz.university.model;

public class Y extends X {
	private int y = 2;
	
	public Y() {
		super();
		System.out.println("Y - Before: " + which);
		which = y;
		System.out.println("Y - After: " + which);
	}
}
