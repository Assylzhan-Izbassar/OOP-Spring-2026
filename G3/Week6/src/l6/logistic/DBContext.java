package l6.logistic;

import java.util.ArrayList;
import java.util.List;

import l6.logistic.model.Customer;
import l6.logistic.model.Parcel;
import l6.logistic.model.ShippingFeature;

public final class DBContext {
	private static List<Parcel> parcels;
	private static List<Customer> customers;
	private static List<ShippingFeature> features;

	{
		parcels = new ArrayList<Parcel>();
		customers = new ArrayList<Customer>();
		features = new ArrayList<ShippingFeature>();
	}

	public DBContext() {
		features.add(new ShippingFeature("INSURED", 0.25));
		features.add(new ShippingFeature("FRAGILE", 0.5));
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

	public static List<Parcel> getParcels() {
		return parcels;
	}

	public static List<Customer> getCustomers() {
		return customers;
	}

	public static List<ShippingFeature> getFeatures() {
		return features;
	}
}
