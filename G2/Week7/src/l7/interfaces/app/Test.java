package l7.interfaces.app;

import l7.interfaces.model.A;
import l7.interfaces.model.B;
import l7.interfaces.model.Moveable;
import l7.interfaces.model.Student;

public class Test {
	public static void main(String[] args) {
		Moveable m = new Student("Amina", 20, 3.0);
		
		Student s1 = (Student) m;

		try {
			Student s2 = (Student) s1.clone();
			s2.setName("Sultan");
			s2.setGPA(3.5);
			s2.changeStep(0, 200);
			
			System.out.println(s1);
			s1.printSteps();
			System.out.println(s2);
			s2.printSteps();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
//		System.out.println(((A)s1).VAL + " " + ((B)s1).VAL);
	}
}
