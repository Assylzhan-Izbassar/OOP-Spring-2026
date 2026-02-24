package l6.logistic.helper;

import java.util.List;

import l6.logistic.model.ShippingFeature;

public final class Message {
	public static void welcome() {
		System.out.println("Welcome, to logistic system!");
	}
	
	public static void systemOptions() {
		System.out.println("\nPlease, choose the option:");
		System.out.println("1 - Create a new parcel.");
		System.out.println("2 - Calculate the total cost of all parcels.");
		System.out.println("3 - List customers.");
		System.out.println("4 - Quit.");
	}
	
	public static void customerFullName() {
		System.out.println("Please, enter customer's fullname:");
	}
	
	public static void parcelAddress() {
		System.out.println("Please, enter parcel's address:");
	}
	
	public static void parcelWeight() {
		System.out.println("Please, enter parcel's weight:");
	}
	
	public static void parcelType() {
		System.out.println("Please, choose the parcel type:");
		System.out.println("1 - Ground parcel.");
		System.out.println("2 - Air parcel.");
		System.out.println("3 - Drone parcel.");
	}
	
	public static void isFeatures() {
		System.out.println("Do you want to add features?");
		System.out.println("1 - Yes.");
		System.out.println("2 - No.");
	}
	
	public static void showFeatureOptions(List<ShippingFeature> sf) {
		int i=0;
		for (ShippingFeature f: sf) {
			i++;
			System.out.println(i + " - " + f);
		}
	}
	
	public static void chooseFeatureOptions() {
		System.out.println("Please, write down the features with comma without spaces (ex: 1,2)");
	}
	
	public static void cost(double cost) {
		System.out.println("The cost of parcel = " + cost + "$.");
	}
	
	public static void totalCost(double cost) {
		System.out.println("The total cost of all parcels = " + cost + "$.");
	}
	
	public static void close() {
		System.out.println("Good bye!");
	}
}
