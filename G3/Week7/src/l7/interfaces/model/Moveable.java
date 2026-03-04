package l7.interfaces.model;

public interface Moveable {
	String SPEED_UNIT = "seconds";
	
	void move();
	
	default void printSmth() {
		System.out.println("smth");
	}
	
	static void validate(double speed) {
		if (speed < 0) {
			throw new IllegalArgumentException("Speed cannot be negative!");
		}
	}
}
