package kz.university.model;

public class X {
	protected int x = 1;
	protected int which;
	
	public X() {
		super();
		System.out.println("X - Before: " + which);
		which = x;
		System.out.println("X - After: " + which);
	}
	
	public int getWhich() {
		return this.which;
	}
}
