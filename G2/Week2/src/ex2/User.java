package ex2;

public class User {
	private String username;
	private String password;
	
//	public User() {
//		
//	}
	
	// custom constructor
	public User(String newUsername, String newPassword) {
		username = newUsername;
		password = newPassword;
	}
	
	// getter
	public String getUsername() { // read-only fields
		return username;
	}
	// setter
//	public void setUsername(String newUsername) {
//		username = newUsername;
//	}
	
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String newPass){
//		if (newPass.length() < 8) {
//			return;
//		} else if (!newPass.contains(".")) {
//			return;
//		}
//		password = newPass;
//	}
	
 	void sendMessage(String message) {
		System.out.print(message);
	}
}
