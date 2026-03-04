package l7.interfaces.model;

public class Student extends Person implements Learnable, Attend {
	private double gpa;
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, double gpa) {
		super(name, age);
		this.gpa = gpa;
	}

	@Override
	public void move() {
		System.out.println("Moving...");
	}

	@Override
	public void breath() {
		System.out.println("Breathing...");
	}

	@Override
	public void run() {
		System.out.println("Running...");
	}

	@Override
	public void learn() {
		System.out.println("Learning...");
	}

	@Override
	public void attend() {
		System.out.println("Attend...");
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", GPA: " + this.gpa; 
	}
}
