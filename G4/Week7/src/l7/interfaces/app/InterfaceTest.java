package l7.interfaces.app;

import java.util.ArrayList;
import java.util.List;

import l7.interfaces.model.B;
import l7.interfaces.model.C;
import l7.interfaces.model.Chargeable;
import l7.interfaces.model.ElectricCar;
import l7.interfaces.model.Payment;
import l7.interfaces.model.Phone;
import l7.interfaces.model.Student;

public class InterfaceTest {

	public static void main(String[] args) {
		Payment.validate(1);
		
		ElectricCar c = new ElectricCar();
		Chargeable p = new Phone();
		
		List<Chargeable> ch = new ArrayList<Chargeable>();
		
		ch.add(c);
		ch.add(p);
		
		for (Chargeable x: ch) {
			x.charge();
		}
		
		// WORKING WITH TYPE
		System.out.println(c.VAL);
		System.out.println(C.VAL);
		
		if (c instanceof B) {			
			System.out.println(((B)c).VAL);
		}
		
		Student s1 = new Student("Arman", 19, 3.0);
		Student s2 = (Student) s1.clone();
		
		s2.setName("Kamila");
		s2.setGpa(3.33);
		s2.changeStep(1, 2000);
		
		System.out.println(s1);
		s1.printSteps();
		System.out.println(s2);
		s2.printSteps();
	}

}
