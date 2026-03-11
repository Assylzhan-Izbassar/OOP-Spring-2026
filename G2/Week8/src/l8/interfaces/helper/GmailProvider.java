package l8.interfaces.helper;

import l8.interfaces.contract.IEmailProvider;

public class GmailProvider implements IEmailProvider {

	@Override
	public boolean send(String to, String message) {
		System.out.println("Sending Gmail to " + to); 
		return true;
	}
	
}
