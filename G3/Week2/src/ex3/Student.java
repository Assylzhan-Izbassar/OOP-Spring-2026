package ex3;

import java.util.Vector;

/*
 * parent - Object
 * */

/*
 * [*] this
 * [*] initialization block
 * [*] final, static modifiers
 * [*] method invocation
 * [] schema of classes
 * [*] toString() 
 * */

/*
 * modifiers: access, general
 * general field: final, static
 * general method: abstract, final, static
 * */

public class Student {
	private final String id;
	private String name;
	private Major major;
	private double gpa;
//	Vector<String> courses;
	
	private static int countStudent;
	
	{
		countStudent++;
		this.id = "26B0" + countStudent;
	}
	
//	public Student() {
//		this.id = "26B0";
//	}
	
	public Student(String name, Major major) { // constructor
//		this.id = "26B0";
		this.name = name;
		this.major = major;
	}
	
//	public Student(Major major) {
//		this();
//		this.major = major;
//	}
//	public Student(double gpa) {
//		this();
//		this.gpa = gpa;
//	}
	
	public Student(String name, Major major, double gpa) {
//		this.id = "26B0";
//		this.name = name;
//		this.major = major;
		this(name, major);
		this.gpa = gpa;
	}
	
	// getters & setters
	public static int getCountStudent() {
		return countStudent;
	}
	public String getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Major getMajor() {
		return this.major;
	}
	public void calcGpa(Vector<Double> marks) {
		// doing calculations
	}
	
	public void method1(int a) {
		System.out.println("a=" + a);
		a = 10;
		System.out.println("a=" + a);
	}
	public void method2() {
		int b = 4;
		method1(b);
		System.out.println("b=" + b);
	}
	
	public void method3(Student a) {
		a.setName("Adiya");
	}
	public void method4() {
		Student b = new Student("Assel", Major.IS);
		System.out.println("before b=" + b);
		method3(b);
		System.out.println("after b=" + b);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.major;
 	}
	
	
}
