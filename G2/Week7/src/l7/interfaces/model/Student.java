package l7.interfaces.model;

// do interfaces have private or some other modifier - no!
// interfaces - protocol for implementing.
// we haven't option to hide

public class Student extends Person implements C, Cloneable {
	
	private double gpa;

	public Student(String name, int age) {
		super(name, age);
	}
	public Student(String name, int age, double gpa) {
		this(name, age);
		this.gpa = gpa;
	}

	@Override
	public void move() {
		System.out.println("Moving...");
	}
	public double getGPA() {
		return gpa;
	}
	
	public void setGPA(double value) {
		if (value > 0 && value <= 4.0) {
			this.gpa = value;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException { // deep cloned.
		Student cloned = (Student) super.clone(); // shallow cloning.
		cloned.setSteps(cloned.getSteps().clone());
//		cloned.steps = this.steps.clone();
		return cloned;
	}
	
	@Override
	public String toString() {
		return super.toString() +  " " + this.getGPA(); 
	}
}
