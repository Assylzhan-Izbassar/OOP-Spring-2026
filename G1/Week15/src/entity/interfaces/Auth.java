package entity.interfaces;

public interface Auth {
	boolean signUp(String username, String password);
	boolean login(String username, String password);
}
