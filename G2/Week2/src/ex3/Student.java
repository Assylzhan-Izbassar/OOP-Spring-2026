package ex3;

/*
 * [*] final
 * [*] this
 * [*] static fields / methods
 * [*] toString() - returning the string rep. of object.
 * [*] initialization block
 * schema of the classes
 * */

public class Student {
	private final String id;
	private String fullname;
	private String address;
	private double gpa;
	
	private static int cntStudent;
	
//	public Student() {
//		id = "26B0";	
//	}
	
	{
		Student.cntStudent++;
		this.id = "26B0" + Student.cntStudent;
	}
	
	public Student(String fullname) {
//		this();
		this.fullname = fullname;
//		this.setField(fullname);
	}
	
	public Student(String fullname, String address) {
//		this.id = "26B0";
//		this.fullname = fullname;
		this(fullname);
//		this.setField(fullname);
		this.address = address;
	}
	
	public void method1(int a) {
		a = 6;
//		return a;
	}
	
	public void method2() {
		int b = 3;
//		b = method1(b);
		method1(b);
		System.out.println(b);
	}
	
	public void method3(Student a) {
		a.setFullName("Adiya");
	}
	
	public void method4() {
		Student b = new Student("Aray");
		method3(b);
		System.out.print(b);
	}
	
//	public void setField(String fullname) {
//		this.id = "26B0";
//		this.fullname = fullname;
//	}
	
	public static int getStudentCount() {
		return Student.cntStudent;
	}
	
	public String getFullName() {
		return this.fullname;
	}
	
	public void setFullName(String fullname) {
		this.fullname = fullname;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.fullname;
	}
}
