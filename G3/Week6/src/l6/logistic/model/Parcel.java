package l6.logistic.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Parcel {
	private double weight;
	private Customer customer;
	private String address;
	private List<ShippingFeature> features;
	
	{
		this.features = new ArrayList<ShippingFeature>();
	}
	
	public Parcel(double weight, Customer customer, String address) {
		this.weight = weight;
		this.customer = customer;
		this.address = address;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getAddress() {
		return this.address;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public List<ShippingFeature> getFeatures() {
		return features;
	}
	
	public void addFeature(ShippingFeature sf) {
		if (sf != null) {
			this.features.add(sf);
		}
	}
	
	public abstract double calculateCost();
	
	public final double totalCost() {
		double result = 0;
		for (ShippingFeature sf: features) {
			result += sf.getAddedCost();
		}
		return result + calculateCost();
	}
	
	@Override
	public String toString() {
		return "Parcel: " + this.weight + " kg to address: " + this.address;  
	}
}
