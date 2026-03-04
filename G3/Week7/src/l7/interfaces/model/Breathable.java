package l7.interfaces.model;

public interface Breathable extends Moveable, Runnable {
	String SPEED_UNIT = Runnable.SPEED_UNIT;
	
	void breath();
}
