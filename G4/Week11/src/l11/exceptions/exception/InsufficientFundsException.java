package l11.exceptions.exception;

public class InsufficientFundsException extends RuntimeException {
	private static final long serialVersionUID = 29L;

	public InsufficientFundsException(String message) {
		super(message);
	}
}
