package kz.university.model;

public class Person {
	protected int id;
	protected String name;
	
	private static int personCnt;
	
	{
		this.id = personCnt++;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void introduce() {
		System.out.print("My name is " + this.name + ". ");
	}
	
	public double paymentSum() {
		return 42500.0;
	}
	
	@Override
	public String toString() {
//		return this.getName(); // WRONG!
		return super.toString();
	}
}
