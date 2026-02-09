package kz.university.model;

public class Person {
	private int id;
	private String name;
	
	private static int personCnt;
	
	{
		personCnt++;
		this.id = personCnt;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("My name is " + this.name);
	}
	
	public double calcSalary() {
		return 0.0;
	}
	
	public String getName() {
		return this.name; 
	}

	public int getId() {
		return id;
	}
}
