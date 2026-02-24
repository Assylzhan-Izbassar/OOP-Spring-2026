package l6.logistic.service;

import java.util.List;

import l6.logistic.model.Parcel;

public class ShippingProcess {
	public double calculateCost(Parcel p) {
		return p.totalCost();
	}
	
	public double calculateTotalCost(List<Parcel> parcels) {
		double result = 0;
		for (Parcel p: parcels) {
			result += p.totalCost();
		}
		return result;
	}
}
