package l6.logistic.service;

import java.util.List;

import l6.logistic.model.Parcel;

public class ShippingProcessor {
	public double calcCost(Parcel p) {
		return p.calcShippingCost();
		//return p.getTotalCost();
	}
	
	public double calcAllParcelCost(List<Parcel> parcels) {
		double result = 0;
		for (Parcel p: parcels) {
			result += p.calcShippingCost();
			// p.getTotalCost();
		}
		return result;
	}
}
