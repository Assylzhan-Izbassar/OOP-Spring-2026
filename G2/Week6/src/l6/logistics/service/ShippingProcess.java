package l6.logistics.service;

import java.util.List;

import l6.logistics.model.Parcel;

public class ShippingProcess {
	public double calculateTotalCost(List<Parcel> parcels) {
		double result = 0;
		
		for (Parcel p: parcels) {
			result += p.getTotalCost();
		}
		
		return result;
	}
	
	public double calculateCost(Parcel p) {
		return p.getTotalCost();
	}
}
