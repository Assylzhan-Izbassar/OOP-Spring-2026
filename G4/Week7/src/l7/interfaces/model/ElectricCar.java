package l7.interfaces.model;

public class ElectricCar implements Moveable, Chargeable, C {

	@Override
	public void move() {
		System.out.println("Car is moving...");
	}

	@Override
	public void charge() {
		System.out.println("Car is charging...");
	}

	@Override
	public int doSmth() {
		return 0;
	}

}
