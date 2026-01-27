package ex3;

public class Student {
	private final String id;
	private String name;
	private double gpa;
	
	private static String universityName;
	
	
	
	private static int counter;
	
	{ // initialization block
		universityName = "KBTU";
		Student.counter++;
		this.id = "26B0" + counter;
	}
	
//	public Student() {
//		this.id = "26B0" + 1;
//		this.gpa = 0.0;
//	}
	
	// constructor 
	public Student(String name) {
		this.name = name;
	}
	
	// methods
	public String getId() {
		return this.id;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
//	public void setGPA(double gpa) {
//		// validations
//		this.gpa = gpa;
//	}
	
	public static String getUniversityName() {
		return Student.universityName;
	}
	
//	public String toString() {
//		return this.name;
//	}
	
}
