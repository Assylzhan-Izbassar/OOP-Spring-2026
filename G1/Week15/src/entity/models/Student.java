package entity.models;

public class Student extends User {
	private static final long serialVersionUID = 1L;
	private final int creditLimit = 21;
	
	public Student(String username, String password) {
		super(username, password);
	}

	public int getCreditLimit() {
		return creditLimit;
	}

}
