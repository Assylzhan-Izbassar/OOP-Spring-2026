package views;

import java.io.IOException;

import controllers.CourseController;

public class MainView extends BaseView {	
	public static void run() throws IOException {
		System.out.println("Welcome to System!");
		System.out.println("Please, choose your method:");
		
		MainView.managerMethodsMsg();
		
		boolean isNotEnded = true;
		while (isNotEnded) { 
			int option = Integer.parseInt(BaseView.br.readLine());
			switch(option) {
			case 1:
				addCourseMsg();
				String courseName = BaseView.br.readLine();
				CourseController.addCourse(courseName);
				BaseView.successMsg("The course is added!");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("Good bye!");
				isNotEnded = false;
				break;
			}
		}
	}
	
	public static void addCourseMsg() {
		System.out.println("Please, enter a course name:");
	}
	
	public static void managerMethodsMsg() {
		System.out.println("1 - Add course");
		System.out.println("2 - Assign course to teacher");
//		System.out.println("3 - Open the course registration;");
//		System.out.println("4 - Close the course registration;");
//		System.out.println("5 - Register student for course;");
		System.out.println("3 - Quit");
	}
}
