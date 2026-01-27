package ex3;

public class StudentTest {

	public static void main(String[] args) {
//		Student s0 = new Student();
		Student s1 = new Student("Mereke", Major.IS);
		Student s2 = new Student("Gani", Major.AC);
		
//		System.out.println(s1.getID());
//		System.out.println(s1.getName());
		System.out.println(s1);
		System.out.println(s2);
		
		s1.method2();
		s1.method4();
		
		System.out.println(Student.getCountStudent());
	}

}
