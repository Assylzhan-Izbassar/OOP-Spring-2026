package l6.logistics.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import l6.logistics.model.AirParcel;
import l6.logistics.model.DroneParcel;
import l6.logistics.model.FeatureType;
import l6.logistics.model.GroundParcel;
import l6.logistics.model.Parcel;
import l6.logistics.model.ShippingFeature;
import l6.logistics.service.PostomatService;

public class ParcelApp {
	public static void main(String[] args) {
		ShippingFeature insured = new ShippingFeature(FeatureType.INSURED, 0.5);
		ShippingFeature fraigle = new ShippingFeature(FeatureType.FRAIGLE, 0.25);
		
		PostomatService ps = new PostomatService();
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Welcome to Logistic System!");
		System.out.println("Please, enter the number:");
		int query = 0;
		while (query != 2) {
			System.out.println("1 - Creating new request!");
			System.out.println("2 - Quit!");
			
			query = Integer.parseInt(sc.nextLine());
			
			if (query == 1) {
				List<Parcel> parcels = new ArrayList<Parcel>();
				System.out.println("Please, enter the number of parcels:"); 
				int numberOfParcels = Integer.parseInt(sc.nextLine());
				
				while (numberOfParcels != 0) {
					System.out.println("Please, enter your parcel weight:");
					int weight = Integer.parseInt(sc.nextLine());
					
					System.out.println("Please, enter which parcel you want!");
					System.out.println("1 - Drone parcel");
					System.out.println("2 - Ground parcel");
					System.out.println("3 - Air parcel");
					
					int parcelType = Integer.parseInt(sc.nextLine());
					
					switch (parcelType) {
						case 1:
							try {
								parcels.add(new DroneParcel(weight));
							} catch (IllegalArgumentException e) {
								e.printStackTrace();
								System.err.println("Please, try again");
								numberOfParcels++;
							}
							break;
						case 2:
							parcels.add(new GroundParcel(weight));
							break;
						case 3:
							parcels.add(new AirParcel(weight));
							break;
					}
	
					numberOfParcels--;
				}
				System.out.print("Total cost of service: ");
				System.out.println(ps.calculateCustomerBill(parcels));
			}	
		}
		
		System.out.println("Good bye!");
		sc.close();
		
//		Parcel p = new GroundParcel(10);
//		p.addFeature(insured);
//		
//		Parcel p2 = new AirParcel(5);
//		p.addFeature(insured);
//		p.addFeature(fraigle);
//		
//		Parcel p3 = new DroneParcel(4);
//		p.addFeature(fraigle);
		
//		System.out.println(p.calculateCost());
//		System.out.println(p2.calculateCost());
	
		
//		List<Parcel> lp = new ArrayList<Parcel>();
//		lp.add(p);
//		lp.add(p2);
//		lp.add(p3);
		
//		System.out.println(ps.calculateCustomerBill(lp));
	}
}
