package kz.university.model;

public class Student extends Person {
	private String major;
	private static double scholarship;
	
	{
		setScholarship(42500.0);
	}
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("I am a student!");
	}
	
	public void introduce(int x) { // Overloading
		for (int i=0; i < x; ++i) {
			this.introduce();
		}
	}
	
	public void study() {
		System.out.println(this.getName() + " is studing...");
	}

	public static void setScholarship(double scholarship) {
		Student.scholarship = scholarship;
	}
	
	@Override
	public double calcSalary() {
		return Student.scholarship;
	}
	
}
