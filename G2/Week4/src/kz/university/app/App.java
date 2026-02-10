package kz.university.app;

import java.util.ArrayList;
import java.util.List;

import kz.university.model.Person;
import kz.university.model.Student;
import kz.university.model.Teacher;
import kz.university.service.PaymentService;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person("Zhandos");
		Student s1 = new Student("Anya", "IS");		
		Person s2 = new Student("Ivan", "CS");
		Person t1 = new Teacher("Ruslan", 300000); 
		
		Teacher t2 = (Teacher) p1;
		System.out.println(t2.getClass());
		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(s1);
		people.add(s2);
		people.add(t1);
		
		((Teacher) t1).setAddWorkHours(5);
		
		PaymentService ps = new PaymentService();
		ps.payment(people, 50000);
		
//		for (Person p: people) {
//			if (p instanceof Student) {
//				((Student)p).introduce("Russia");
//			} else {
//				p.introduce();
//			}
//		}
		
//		p1.introduce();
//		s1.introduce();
//		s1.study();
//		((Student)s2).study();
		
//		Y yIns = new Y();
//		System.out.println(yIns.getWhich());
		
	}
}
