package services;

import java.util.List;

import config.DBContext;
import entity.models.User;

public class AuthService {
	public static User login(String username, String password) {
		List<User> users = DBContext.getInstance().getUsers();
		
		for (User u: users) {
			if (u.equals(new User(username, password))) {
				return u;
			}
		}
		return null;
	}
}
