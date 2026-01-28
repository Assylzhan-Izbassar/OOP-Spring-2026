package ex2;

/*
 * [*] Object
 * [*] this
 * [*] overriding / overloading
 * [*] static, and final modifiers
 * [*] initialization block 
 * [*] toString()
 * [] method invocation, and passing the data
 * [] schema of classes.
 * */

public class Student {
	private final String id;
	private String name;
	private double gpa;
//	private Vector<Course> courses;
	
	private static int studentCnt;
	
	{
		studentCnt++;
		this.id = "26B0" + studentCnt;
	}
	
//	public Student(String id, String name) { // Overriding
//		this.id = id + studentCnt;
//		this.name = name;
//	}
	
	public Student(String name) { // Overloaded;
//		this("26B0", name);
//		this.id = "26B0";
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getID() {
		return this.id;
	}
	
//	public void setID(String newId) {
//		id = newId;
//	}
	
	public static int getStudentCnt() { 
		return studentCnt;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public double calcGPA() {
		// logic
		return 0.0;
	}
	
	public static void method1(int a) {
		System.out.println("a=" + a);
		a = 10;
		System.out.println("a=" + a);
	}
	
	public static void method2() {
		int b = 5;
		method1(b);
		System.out.println("b=" + b);
	}
	
	public static void method3(Student a) {
		System.out.println("a=" + a);
		a.setName("Guldana");
//		System.out.println("a=" + a);
	}
	
	public static void method4() {
		Student b = new Student("Assel");
		method3(b);
		System.out.println("b=" + b);
	}
	
	
	@Override
	public String toString() {
		return this.getID() + " " + this.getName();
	}
}
