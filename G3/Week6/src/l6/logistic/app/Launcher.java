package l6.logistic.app;

import java.util.Scanner;
import java.util.StringTokenizer;

import l6.logistic.DBContext;
import l6.logistic.helper.Message;
import l6.logistic.model.AirParcel;
import l6.logistic.model.Customer;
import l6.logistic.model.DroneParcel;
import l6.logistic.model.GroundParcel;
import l6.logistic.model.Parcel;
import l6.logistic.service.CustomerService;
import l6.logistic.service.ShippingProcess;

public class Launcher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DBContext db = new DBContext(); 
		
		CustomerService cs = new CustomerService();
		ShippingProcess sp = new ShippingProcess();
		
		Message.welcome();
		
		int query = -1;
		
		while (query != 4) {
			Message.systemOptions();
			query = Integer.parseInt(sc.nextLine());
			
			if (query == 1) {
				Message.customerFullName();
				String fullName = sc.nextLine();
				
				Customer newCustomer = cs.createCustomer(fullName);
				// adding that customer to db;
				db.addCustomer(newCustomer);
				
				Message.parcelAddress();
				String address = sc.nextLine();
				
				Message.parcelWeight();
				double weight = Double.parseDouble(sc.nextLine());
				
				Parcel newParcel = null;
				boolean isChosen = true;
				
				do {
					isChosen = true;
					Message.parcelType();
					int parcelType = Integer.parseInt(sc.nextLine());
										
					if (parcelType == 1) {
						newParcel = new GroundParcel(weight, newCustomer, address);
					} else if (parcelType == 2) {
						newParcel = new AirParcel(weight, newCustomer, address);
					} else if (parcelType == 3) {
						try {
							newParcel = new DroneParcel(weight, newCustomer, address);
						} catch (IllegalArgumentException ie) {
							ie.printStackTrace();
							isChosen = false;
						}
					}
				} while (isChosen == false);
				
				Message.isFeatures();
				int featureOption = Integer.parseInt(sc.nextLine());
				
				if (featureOption == 1) {
					Message.showFeatureOptions(DBContext.getFeatures());
					Message.chooseFeatureOptions();
					
					String featureOptions = sc.nextLine();
					StringTokenizer st = new StringTokenizer(featureOptions, ",");
					while(st.hasMoreTokens()) {
						int fo = Integer.parseInt(st.nextToken().trim());
						newParcel.addFeature(DBContext.getFeatures().get(fo-1));
					}
				}
				
				db.addParcel(newParcel);
				double cost = sp.calculateCost(newParcel);
				Message.cost(cost);
				
			} else if (query == 2) {
				double totalCost = sp.calculateTotalCost(DBContext.getParcels());
				Message.totalCost(totalCost);
				
			} else if (query == 3) {
				cs.printCustomers(DBContext.getCustomers());
			}
		}
		
		Message.close();
		sc.close();
	}
}
