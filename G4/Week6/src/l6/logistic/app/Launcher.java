package l6.logistic.app;

import java.util.Scanner;

import l6.logistic.DBContext;
import l6.logistic.helper.Message;
import l6.logistic.service.CustomerService;
import l6.logistic.service.ParcelService;
import l6.logistic.service.ShippingProcessor;

public class Launcher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerService cs = new CustomerService();
		ParcelService ps = new ParcelService();
		ShippingProcessor sp = new ShippingProcessor();
		// TODO: include FeatureService
		DBContext db = new DBContext();
		
		Message.welcome();
		int query = -1;
		
		while (query != 4) {
			Message.showSystemOptions();
			query = Integer.parseInt(sc.nextLine());
			
			if (query == 1) {
				Message.customerName();
				String name = sc.nextLine();
				db.addCustomer(cs.createCustomer(name));
				
				Message.parcelAddress();
				String address = sc.nextLine();
				
				Message.parcelWeight();
				double weight = Double.parseDouble(sc.nextLine());
				
				Object o = null;
				do {
					Message.parcelType();
					int parcelOptionQuery = Integer.parseInt(sc.nextLine());
					
					o = ps.createParcel(
							weight, 
							db.getLastCustomer(), 
							address, 
							parcelOptionQuery);
				} while (o == null);
				
				db.addParcel(o);
				
				// TODO: Message.parcelFeature
				// TODO: including feature
				
				double parcelCost = sp.calcCost(db.getLastParcel());
				Message.showParcelCost(parcelCost);
			} else if (query == 2) {
				double totatCost = sp.calcAllParcelCost(
						DBContext.getParcels());
				Message.showTotalCost(totatCost);
			} else if (query == 3) {
				cs.printAllCustomers(DBContext.getCustomers());
			}
		}
		
		Message.quit();
		sc.close();
	}

}
