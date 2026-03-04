package l7.interfaces.model;

public class Student extends Person implements C {
	private double gpa;
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, double gpa) {
		this(name, age);
		this.gpa = gpa;
	}

	public double getGPA() {
		return gpa;
	}
	
	public void setGPA(double value) {
		if (value > 0.0 && value <= 4.0) {
			this.gpa = value;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", GPA = " + this.getGPA() + ";";
	}
}
