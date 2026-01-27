package ex2;

/*
 * access modifiers:
 * - public;
 * - private;
 * - protected;
 * - package.
 * */

/*
 * overriding - we have some method / construct in parent, 
 * 				then child class we override 
 * overloading - we have same signature method / construct
 * 				with other parameters
 * */
public class User {
	private String username;
	private String password;
	
	public User() {
		
	}
	
	public User(String newUsername) {
		username = newUsername;
	}
	
//	public User(String newPassword) {
//		password = newPassword;
//	}
	
	public User(String newUsername, String newPassword) {
		username = newUsername;
		password = newPassword;
	}
	
	
	
	public String getUsername() { // getter = read-only field
		return username;
	}
	
//	public void setUsername(String newUsername) { // setter
//		if (newUsername.length() < 8) {
//			return;
//		}
//		username = newUsername;
//	}
	
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String newPassword) {
//		password = newPassword;
//	}
}
