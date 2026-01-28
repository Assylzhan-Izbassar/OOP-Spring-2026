package ex2;

public class StudentTest {
	
	// this - reference of s1 inside the class

	public static void main(String[] args) {
		Student s1 = new Student("Sultan");
		Student s2 = new Student("Asiya");
		
		System.out.println(s1);
		System.out.println(s2);
		
//		System.out.println(s1.getID());
//		System.out.println(s1.getName());
//		
//		System.out.println(s2.getID());
//		System.out.println(s2.getName());
		
		System.out.println(Student.getStudentCnt());
		
		Student.method2();
		Student.method4();

	}

}
