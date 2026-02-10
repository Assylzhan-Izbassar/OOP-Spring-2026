package kz.university.model;

public class Person {
	private int id;
	protected String name;
	
	private static int personCnt;
	
	{
		personCnt++;
		this.id = personCnt;
	}
	
//	public Person() {
//		super();
//	}
	
	public Person(String name) {
//		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void introduce() {
		System.out.println("My name is " + this.getName());
	}
	
	public double calcSalary() {
		return 0.0;
	}
}
