package l8.interfaces.app;

import l8.interfaces.contract.IEmailProvider;
import l8.interfaces.helper.GmailProvider;
//import l8.interfaces.helper.SendGridProvider;
import l8.interfaces.service.OrderService;

public class MailTest {
	public static void main(String[] args) {
		IEmailProvider ep = new GmailProvider(); 
		OrderService os = new OrderService(ep);
		
		os.completeOrder("a.izbassar@kbtu.kz");
	}
}
