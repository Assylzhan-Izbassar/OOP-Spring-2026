package l7.interfaces.model;

public abstract class Person implements Breathable, Cloneable, Comparable<Person> {
	
	private String name;
	private int age;
	private int[] steps = {1400, 2000, 950};
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name; 
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age; 
	}
	
	public int[] getSteps() {
		return steps;
	}

	public void setSteps(int[] steps) {
		this.steps = steps;
	}
	
	public void printSteps() {
		for (int i=0; i < this.steps.length; ++i) {
			System.out.print(this.steps[i] + " ");
		}
		System.out.println();
	}
	
	public void changeStep(int i, int value) {
		if (i >= 0 && i < this.steps.length) {
			this.steps[i] = value;
		}
	}
	
	@Override
	public int compareTo(Person o) {
		if (this.getAge() > o.getAge()) {
			return 1;
		} else if (this.getAge() == o.getAge()) {
			return 0;
		}
		return -1;
	}
	
	@Override
	public Object clone() { // deep clone
		try {
			Person p = (Person) super.clone(); // shallow clone
			p.steps = this.steps.clone();
			return p;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return this.name + ", age: " + this.age;
	}
}
