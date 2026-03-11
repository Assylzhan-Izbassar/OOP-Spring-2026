package l8.interfaces.tester;

import l8.interfaces.contract.IEmailProvider;
import l8.interfaces.model.SendGridProvider;
import l8.interfaces.service.OrderService;

public class EmailTest {
	public static void main(String[] args) {
		IEmailProvider emailProvider = new SendGridProvider(); 
		OrderService os = new OrderService(emailProvider);
		
		os.completeOrder("a.izbassar@kbtu.kz");
	}
}
