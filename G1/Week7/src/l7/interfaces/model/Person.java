package l7.interfaces.model;

public abstract class Person implements Breathable, Cloneable {
	
	private String name;
	private int age;
	private int[] steps = {10, 12, 15};
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	@Override
	public void move() {
		System.out.println("Moving..");
	}
	
	@Override
	public void breath() {
		System.out.println("Breath..");
	}

	@Override
	public void run() {
		System.out.println("Running..");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}
	
	public void printSteps() {
		for (int i=0; i < this.steps.length; ++i) {
			System.out.print(this.steps[i] + " ");
		}
		System.out.println();
	}
	
	public void changeValue(int idx, int value) {
		if (idx >= 0 && idx < this.steps.length) {
			this.steps[idx] = value;
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException { // deep clone;
		Person cloned = (Person) super.clone(); // shallow clone;
		cloned.steps = this.steps.clone(); // cloning mutable object;

		return cloned;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName();
	}
}
