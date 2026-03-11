package l8.interfaces.contract;

public interface IEmailProvider {
	boolean send(String to, String message);
}
