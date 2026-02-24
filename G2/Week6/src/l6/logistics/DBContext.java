package l6.logistics;

import java.util.ArrayList;
import java.util.List;

import l6.logistics.model.Customer;
import l6.logistics.model.Parcel;

public class DBContext {
	private static List<Customer> customers;
	private static List<Parcel> parcels;
	
	{
		customers = new ArrayList<Customer>();
		parcels = new ArrayList<Parcel>();
	}
	
	public void addCustomer(Customer c) {
		if (c != null) {
			customers.add(c);
		}
	}
	
	public void addParcel(Parcel p) {
		if (p != null) {
			parcels.add(p);
		}
	}
	
	public static List<Customer> getCustomers() {
		return customers;
	}
	
	public static List<Parcel> getParcels() {
		return parcels;
	}
}
