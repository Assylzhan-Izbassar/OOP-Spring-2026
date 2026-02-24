package l6.logistics.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Parcel {
	private double weight;
	private Customer customer;
	private String address;
	private List<ShippingFeature> features;
	
	{
		features = new ArrayList<ShippingFeature>();
	}
	
	public Parcel(Customer customer, String address, double weight) {
		this.customer = customer;
		this.address = address;
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void addFeature(ShippingFeature sf) {
		if (sf != null) {
			this.features.add(sf);
		}
	}
	
	public abstract double calculateCost();
	
	public final double getTotalCost() {
		double result = 0;
		
		for (ShippingFeature sf: this.features) {
			result += sf.getAddedCost();
		}
		return result + this.calculateCost();
	}
	
	@Override
	public String toString() {
		return "Parcel, with weight " + this.weight;
	}
}
