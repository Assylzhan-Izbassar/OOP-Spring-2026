package l6.logistics.app;

import java.util.Scanner;

import l6.logistics.DBContext;
import l6.logistics.model.AirParcel;
import l6.logistics.model.Customer;
import l6.logistics.model.DroneParcel;
import l6.logistics.model.GroundParcel;
import l6.logistics.model.Parcel;
import l6.logistics.service.CustomerService;
import l6.logistics.service.Message;
import l6.logistics.service.ShippingProcess;

public class LogisticMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DBContext db = new DBContext();
		CustomerService cs = new CustomerService();
		ShippingProcess sp = new ShippingProcess();
		
		int query = 0;
		Message.welcome();
		
		while (query != 4) {
			Message.mainOptions();
			query = Integer.parseInt(sc.nextLine());
			
			if (query == 1) {
				Message.customerName();
				String fullname = sc.nextLine();
				Customer newCustomer = cs.createCustomer(fullname);
				db.addCustomer(newCustomer);
				
				Message.parcelWeight();
				double weight = Integer.parseInt(sc.nextLine());
				Message.parcelAddress();
				String address = sc.nextLine();
				
				boolean isCreated = false;
				Parcel newParcel = null;
				
				while (isCreated == false) {
					Message.parcelType();
					Message.parcelTypeOptions();
					
					int parcelOption = Integer.parseInt(sc.nextLine());
					
					if (parcelOption == 2) {
						newParcel = new AirParcel(newCustomer, address, weight);
						isCreated = true;
					} else if (parcelOption == 3) {
						try {						
							newParcel = new DroneParcel(newCustomer, address, weight);
							isCreated = true;
						} catch (IllegalArgumentException ie) {
							ie.printStackTrace();
						}
					} else {
						newParcel = new GroundParcel(newCustomer, address, weight);
						isCreated = true;
					}
				}
				
				Message.isFeatures();
				boolean isFeature = Boolean.parseBoolean(sc.nextLine());
				
				if (isFeature) {
					Message.featureOptions();
					// TODO: add some features...
					
					// newParcel.addFeature(null);
				}
				
				db.addParcel(newParcel);
				double parcelCost = sp.calculateCost(newParcel);
				Message.printCost(parcelCost);
			} else if (query == 2) {
				double totalParcelCost = sp.calculateTotalCost(DBContext.getParcels());
				Message.printCost(totalParcelCost);
			} else if (query == 3) {
				cs.printCustomers(DBContext.getCustomers());
			}
		}
		Message.close();
		sc.close();
	}

}
