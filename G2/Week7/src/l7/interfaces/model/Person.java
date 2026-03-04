package l7.interfaces.model;

public abstract class Person implements Moveable {
	private String name;
	private int age;
	private int[] steps = {1000, 870, 2500};
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
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
	
	public void setSteps(int[] steps) {
		this.steps = steps;
	}
	
	public int[] getSteps() {
		return this.steps;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
