package ex2;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the username");
		String name = scan.nextLine();
		System.out.println("Please, enter the password");
		String password = scan.nextLine();
		scan.close();
		
		User u1 = new User(name, password);
//		u1.username = name;
//		u1.setUsername(name);
//		u1.password = password;
//		u1.setPassword(password);
		
		System.out.println("Welcome, " + u1.getUsername() + "!");
//		u1.username = "test1";
		System.out.println("Welcome, " + u1.getUsername() + "!");
		
//		System.out.println(u1.getPassword());
	}

}
