package kz.university.model;

public class Student extends Person {
	private Spec spec;
	private static double scholarship;
	
	{
		scholarship = 55000;
	}
	
	public Student(String name, Spec spec) {
		super(name);
		this.spec = spec;
	}

	public Spec getSpec() {
		return spec;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public void introduce() {
//		super.introduce();
//		System.out.print("I am a student!");
//	}
	public void introduce(String language) { // Overload
		if (language.equals("Kazakh")) {
			System.out.print("Menin atym " + this.name);
		}
	}
	
	public void study() {
		System.out.println(this.name + " is studing!");
	}
	
	@Override
	public double paymentSum() {
		return Student.scholarship;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
