package ex1;

/* access modifiers:
 * 1. public - data / methods are accessed everywhere
 * 2. private - only inside the class;
 * 3. protected - only inside the class and subclasses;
 * 4. package / default - data / methods is accessable in package
 * */

public class Car { // schema / blueprint
	// fields
	int speed;
	private String color = "White";
	
	// constructors
	public Car() {
		
	}
	public Car(String newColor) {
		color = newColor;
	}
	public Car(int newSpeed, String newColor) {
		speed = newSpeed;
		color = newColor;
	}
	
	// methods
	// read-only fields - encapsulation without setter
	public String getColor() { // getter
		return color;
	}
	
	public void setColor(String newColor) { // setter
		// validate the value;
		if (newColor.length() < 8)
			return;
		color = newColor;
	}
	
	void accelerate() {
		speed += 10;
	}
	void brake() {
		speed -= 5;
	}
}
