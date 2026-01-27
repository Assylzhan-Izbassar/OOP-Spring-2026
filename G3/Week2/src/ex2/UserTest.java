package ex2;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String password = scan.nextLine();
		
//		User u0 = new User();
		
		User u1 = new User(name, password);
		
//		u1.username = name;
//		u1.password = password;
//		
//		System.out.println(u1.username);
//		System.out.print(u1.password);
		
//		u1.setUsername(name);
//		u1.setPassword(password);
		
		System.out.println(u1.getUsername());
//		System.out.print(u1.getPassword());
		
		scan.close();
	}

}
