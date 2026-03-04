package l7.interfaces.app;

import l7.interfaces.model.Student;

public class InterfaceTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("Almas", 19, 3.0);
		Student s2 = (Student) s1.clone();
		
		Object o;
		
		s2.setGPA(3.33);
		s2.setName("Turar");
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2.changeValue(1, 25);
		
		s1.printSteps();
		s2.printSteps();
		
		
//		if (p1 instanceof Student) {			
//			Student s1 = (Student) p1;
//			System.out.println(s1.VAL);
//			System.out.println(((A)s1).VAL);
//		}
//		System.out.print(p1.getClass());
	}

}
