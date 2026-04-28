package views;

import java.io.IOException;

import controllers.CourseController;

public class MainView extends BaseView {
	public static void run() throws NumberFormatException, IOException {
		welcomeMsg();
		
		boolean isNotEnded = true;
		while (isNotEnded) {
			managerOptionsMsg();
			Integer option = Integer.parseInt(reader.readLine());
			switch(option) {
			case 1:
				courseAddingMsg();
				String courseName = reader.readLine();
				boolean result = CourseController.addCourse(courseName);
				if (result) {successMsg("Course is added!");}
				break;
			case 2:
				courseShowingMsg();
				break;
			case 3:
				break;
			default:
				byeMsg();
				isNotEnded = false;
				break;
			}
		}
	}
	
	public static void courseAddingMsg() {
		System.out.println("Please, enter the course name:");
	}
	
	public static void courseShowingMsg() {
		System.out.println("Created courses:");
		CourseController.listCourses();
	}
	
	public static void managerOptionsMsg() {
		System.out.println("\nPlease, choose your option:");
		System.out.println("1 - Add course");
		System.out.println("2 - List courses");
		System.out.println("3 - Assign course to teacher");
		System.out.println("4 - Quit");
	}
	
	public static void welcomeMsg() {
		System.out.println("Welcome to System!");
	}
	
	public static void byeMsg() {
		System.out.println("Good bye!");
	}
}
