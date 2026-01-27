package ex3;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Azim Sultan");
		Student s2 = new Student("Saule Azamat");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(Student.getStudentCount());
		
//		s1.method2();
		s1.method4();
	}

}
