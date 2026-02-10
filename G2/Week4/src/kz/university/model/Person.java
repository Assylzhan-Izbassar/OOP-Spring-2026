package kz.university.model;

public class Person {
	protected int id;
	private String name;
	
	private static int personCnt;
	
	{
		personCnt++;
		this.id = personCnt;
	}
	
	public Person(String name) {
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
