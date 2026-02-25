package l6.logistic.service;

import l6.logistic.model.AirParcel;
import l6.logistic.model.Customer;
import l6.logistic.model.DroneParcel;
import l6.logistic.model.GroundParcel;
import l6.logistic.model.Parcel;

public class ParcelService {
	public Parcel createParcel(
			double weight, 
			Customer customer,
			String address,
			int parcelOptionQuery) {
		Parcel p = null;
		
		if (parcelOptionQuery == 1) {
			p = new AirParcel(weight, customer, address);
		} else if (parcelOptionQuery == 2) {
			p = new GroundParcel(weight, customer, address);
		} else if (parcelOptionQuery == 3) {
			try {				
				p = new DroneParcel(weight, customer, address);
			} catch(IllegalArgumentException ie) { 
				ie.printStackTrace();
			}
		}
		return p;
	}
}
