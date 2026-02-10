package kz.university.model;

public class Student extends Person {
	private String major;
	private double scholarship;
	
	{
		this.setScholarship(42500.0);
	}
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("I am a student");
	}
	
	public void introduce(String language) {
		if (language.equals("Russia")) {
			System.out.println("Привет! Я " + this.getName());
		} else {
			this.introduce();
		}
	}
	
	public void study() {
		System.out.println(this.getName() + " is studing...");
	}
	
	@Override
	public double calcSalary() {
		return this.getScholarship();
	}

	public String getMajor() {
		return major;
	}

	public double getScholarship() {
		return scholarship;
	}

	public void setScholarship(double scholarship) {
		this.scholarship = scholarship;
	}
}
