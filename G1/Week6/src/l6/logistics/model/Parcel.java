package l6.logistics.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Parcel {
	protected double weigth;
//	protected static double limitWeight = 0.0; 
	private List<ShippingFeature> features;
	
	{
		this.features = new ArrayList<ShippingFeature>();
	}
	
	public Parcel(double weight) {
		this.weigth = weight;
	}
	
//	public static double getLimitWeight() {
//		return limitWeight;
//	}
	
	public abstract double calculateCost();
	
	public final void addFeature(ShippingFeature sf) {
		if (sf != null) {			
			this.features.add(sf);
		}
	}
	
	public final double calculateTotalCost() {
		double totalCost = this.calculateCost();
		
		for (ShippingFeature fs: this.features) {
			totalCost += fs.getAddedCost();
		}
		
		return totalCost;
	}
}
