package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import entity.models.User;
import services.AuthService;

public class Core {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void run() throws IOException {
		System.out.println("Welcome, to System!");
		System.out.println("Please, authorize!");
		User currUser = auth();
		
		if (currUser != null) {
			mainPage();
		} else {
			System.err.println("Username or password are not valid!");
		}
	}
	
	public static User auth() throws IOException {
		System.out.println("Enter, username:");
		String username = br.readLine();
		System.out.println("Enter, password:");
		String password = br.readLine();
		
		User currUser = AuthService.login(username, password);
		
		return currUser;
	}
	
	public static void mainPage() {
		System.out.println("1 - List users");
		System.out.println("2 - Quit");
	}
}
