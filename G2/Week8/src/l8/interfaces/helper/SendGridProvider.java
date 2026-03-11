package l8.interfaces.helper;

import l8.interfaces.contract.IEmailProvider;

public class SendGridProvider implements IEmailProvider {

	@Override
	public boolean send(String to, String message) {
		System.out.println("Sending SendGrid to " + to);
		return true;
	}
	
}
