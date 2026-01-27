package ex3;

public class StudentTest {

	public static void main(String[] args) {
//		Student s0 = new Student(); // we cannot create with default constructor;
		Student s1 = new Student("Sultan");
//		Student.counter = 10;
		Student s2 = new Student("Aisha");
		
		System.out.println(s1);
		System.out.println(s1.getId());
		System.out.println(s2.getId());
		System.out.println(Student.getUniversityName());

	}

}
