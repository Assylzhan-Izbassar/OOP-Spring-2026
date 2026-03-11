package l8.interfaces.model;

import l8.interfaces.contract.IEmailProvider;

public class GmailProvider implements IEmailProvider {

	@Override
	public boolean send(String email, String message) {
		// Calling API of Gmail
		System.out.println("Sending email with Gmail to " + email);
		return true;
	}

}
