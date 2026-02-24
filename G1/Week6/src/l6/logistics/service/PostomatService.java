package l6.logistics.service;

import java.util.List;

import l6.logistics.model.Parcel;
import l6.logistics.model.ShippingFeature;

public class PostomatService {
//	public double calculateTotalCost(Parcel p, List<ShippingFeature> features) {
//		double totalCost = p.calculateCost(); 
//		for (ShippingFeature f: features) {
//			totalCost += f.getAddedCost();
//		}
//		return totalCost;
//	} // GOOD when serving one parcel;
	
	public double calculateCustomerBill(List<Parcel> parcels) {
		double result = 0;
		for (Parcel p: parcels) {
			result += p.calculateTotalCost();
		}
		return result;
	}
}
