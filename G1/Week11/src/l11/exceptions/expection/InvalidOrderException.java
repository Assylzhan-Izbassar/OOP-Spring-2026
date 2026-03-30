package l11.exceptions.expection;

public class InvalidOrderException extends RuntimeException {
	
	private static final long serialVersionUID = 29;

	public InvalidOrderException(String message) {
		super(message);
	}

}
