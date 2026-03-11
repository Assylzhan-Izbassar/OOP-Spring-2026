package l8.interfaces.model;

import l8.interfaces.contract.IEmailProvider;

public class SendGridProvider implements IEmailProvider {

	@Override
	public boolean send(String email, String message) {
		System.out.println("Sending email with SendGrid to " + email);
		return true;
	}
	
}
