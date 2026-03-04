package l7.interfaces.model;

public class Student extends Person {
	
	private double gpa;

	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, double gpa) {
		this(name, age);
		this.setGpa(gpa);
	}

	@Override
	public void move() {
		System.out.println("Moving...");
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", and GPA=" + this.getGpa(); 
	}
	
}
