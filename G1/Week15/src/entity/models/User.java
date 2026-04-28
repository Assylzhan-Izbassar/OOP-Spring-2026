package entity.models;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.username, this.password);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null || !(o instanceof User)) return false;
		User user = (User) o;
		return this.username.equals(user.getUsername()) && this.password.equals(user.getPassword());
	}
	
	@Override
	public String toString() {
		return this.username;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	
}
