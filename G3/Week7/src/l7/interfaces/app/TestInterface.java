package l7.interfaces.app;

import l7.interfaces.model.Student;

public class TestInterface {
	public static void main(String[] args) {
		Student s1 = new Student("Ulan", 20, 3.0);
		Student s2 = (Student) s1.clone();
		
//		Object o;
		
		s2.setName("Jomart");
		s2.setGPA(3.45);
		s2.changeStep(1, 500);
		
		System.out.println(s1);
		s1.printSteps();
		System.out.println(s2);
		s2.printSteps();
		
		int result = s1.compareTo(s2);
		
		if (result == 1) {
			System.out.println(s1);
		} else if (result == 0) {
			System.out.println(s1.getName() + " or " + s2.getName());
		} else {
			System.out.println(s2);
		}
		
//		System.out.println();
//		System.out.println("(Moveable) p: " + ((Moveable) s1).SPEED_UNIT);
//		System.out.println("(Runnable) p: " + ((Runnable) s1).SPEED_UNIT);
//		System.out.println("(Breathable) p: " + ((Breathable) s1).SPEED_UNIT);
		
//		System.out.println(Moveable.SPEED_UNIT);
//		System.out.println(Runnable.SPEED_UNIT);
//		System.out.println(p.SPEED_UNIT);
		
	}
}
