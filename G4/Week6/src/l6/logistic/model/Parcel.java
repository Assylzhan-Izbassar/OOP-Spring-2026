package l6.logistic.model;

import java.util.List;

public abstract class Parcel {
	private double weight;
	private Customer customer;
	private String address;
	private List<ShippingFeature> features;
	
	{
		// TODO: init
	}
	
	public Parcel(double weight, Customer customer, String address) {
		this.weight = weight;
		this.customer = customer;
		this.address = address;
	}

	public double getWeight() {
		return weight;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getAddress() {
		return address;
	}
	
	// TODO: add feature
	
	public abstract double calcShippingCost();
	
	// TODO: final getTotalCost() use calcShippingCost();
	
	@Override
	public String toString() {
		return "Parcel: " + this.getWeight() + " of " + this.customer;
	}
	
}
