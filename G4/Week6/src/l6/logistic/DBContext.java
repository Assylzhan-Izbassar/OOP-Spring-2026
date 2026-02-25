package l6.logistic;

import java.util.ArrayList;
import java.util.List;

import l6.logistic.model.Customer;
import l6.logistic.model.Parcel;
import l6.logistic.model.ShippingFeature;

public class DBContext {
	private static List<Parcel> parcels;
	private static List<Customer> customers;
	private static List<ShippingFeature> features;
	
	{
		parcels = new ArrayList<Parcel>();
		customers = new ArrayList<Customer>();
		features = new ArrayList<ShippingFeature>();
	}
	
	public DBContext() {
		features.add(new ShippingFeature("INSURED", 0.5));
		features.add(new ShippingFeature("FRAGILE", 0.75));
	}
	
	// connection
	
	// get / setter
	public static List<Parcel> getParcels() {
		return parcels;
	}
	
	public static List<Customer> getCustomers() {
		return customers;
	}
	
	public static List<ShippingFeature> getFeatures() {
		return features;
	}
	
	// read
	public Customer getLastCustomer() {
		return customers.getLast();
	}
	
	public Parcel getLastParcel() {
		return parcels.getLast();
	}

	
	// save
	public void addParcel(Object newParcel) {
		if (newParcel != null && newParcel instanceof Parcel) {
			parcels.add((Parcel) newParcel);
		}
	}
	public void addCustomer(Customer newCustomer) {
		if (newCustomer != null) {
			customers.add(newCustomer);
		}
	}
}
