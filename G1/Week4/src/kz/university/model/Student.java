package kz.university.model;

public class Student extends Person {
	private double gpa;
	private static double scholarship;
	
	{
		Student.scholarship = 42500;
	}
	
	public Student(String name) {
		super(name);
	}
	
	public Student(String name, double gpa) {
		this(name);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}
	
	@Override
	public double calcSalary() {
		return scholarship;
	}
	
//	@Override
//	public void introduce() {
//		super.introduce();
//		System.out.println("I am a student!");
//	}
	
//	public void introduce() {
//		
//	}
	
	public void introduce(String language) { // Overloaded
		if (language.equals("Russia")) {
			System.out.println("Привет!");
		}
	}
	
	public void study() {
		System.out.println(this.getName() + "is studing");
	}

	public double getScholarship() {
		return scholarship;
	}
}
