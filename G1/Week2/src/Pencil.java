
public class Pencil {
	// fields
	/*
	 * Access modifiers:
	 * public - accessing them everywhere, and change the values;
	 * private - this only accessed within the class.
	 * protected - this only accessed within the class, and inside child classes;
	 * package / default - we can access only inside the packages.
	 * */
	private String color;
	String weight;
//	double price;
//	String type;
//	double length;
//	String brand;
	
	// constructor
	public Pencil() { // empty constructor = default
		color = "black";
		weight = "HB";
	}
	public Pencil(String color) { // initial values of required parameter;
		this();
		this.color = color; // this -> reference of the instance of class.
	} // override the constructor

	
//	public Pencil(String newWeigth, String color="black") {
//		not good constructor!
//	}
	
	// overloading - the same signature of methods, or constructors, but with
	// different access parameters.
	
	public Pencil(String color, String weight) {
		this(color);
//		this.color = color;
		this.weight = weight;
	}
	
	
	// methods
	public String getColor() { // encapsulation
		return color;
	}
	public void setColor(String newColor) {
		if (newColor.length() >= 4) {
			color = newColor;			
		}
	}
	
	void setWeight(String newWeight) {
		weight = newWeight;
	}
	
	void draw() {
		System.out.println("Drawing...");
	}
	
	public String toString() {
		return "Pencil with weight " + this.weight + ", and color = " + this.color;   
	}
	
	// toString()
	// equals()
	// hashCode()
}
