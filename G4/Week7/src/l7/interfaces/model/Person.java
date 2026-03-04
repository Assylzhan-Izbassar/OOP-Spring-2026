package l7.interfaces.model;

public abstract class Person implements Moveable, Cloneable {
	private String name;
	private int age;
	private int[] steps = {1000, 6000, 1200};
	
	public Person(String name, int age) { 
		this.setName(name);
		this.setAge(age);
	}
	
	@Override
	public abstract void move();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public Object clone() { // deep cloning 
		try {
			Person p = (Person) super.clone(); // shallow cloning 
			p.steps = this.steps.clone(); // shallow cloning
			return p;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return this.getName() + " with age: " + this.getAge();
	}

	public int[] getSteps() {
		return steps;
	}

	public void changeStep(int i, int value) {
		if (i >= 0 && i < this.steps.length) {
			this.steps[i] = value;
		}
	}
	
	public void printSteps() {
		for (int i=0; i < this.steps.length; ++i) {
			System.out.print(this.steps[i] + " ");
		}
		System.out.println();
	}
}
