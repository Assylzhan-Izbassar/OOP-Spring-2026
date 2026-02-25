package l6.logistic.helper;

public class Message {
	public static void welcome() {
		System.out.println("Welcome to the Logistic System!");
	}
	
	public static void showSystemOptions() {
		System.out.println("\nPlease, choose one option below:");
		System.out.println("1 - Create a new parcel;");
		System.out.println("2 - Calculate a total cost of all parcels;");
		System.out.println("3 - Show all customers;");
		System.out.println("4 - Quit;");
	}
	
	public static void customerName() {
		System.out.println("Please, enter the name of a customer:");
	}
	
	public static void parcelAddress() {
		System.out.println("Please, enter the parcel address:");
	}
	
	public static void parcelWeight() {
		System.out.println("Please, enter the parcel weight:");
	}
	
	public static void parcelType() {
		System.out.println("Please, choose the parcel type:");
		System.out.println("1 - Air parcel");
		System.out.println("2 - Ground parcel");
		System.out.println("3 - Drone parcel");
	}
	
	public static void featureChoice() {
		System.out.println("Please, choose do you need features?:");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
	}
	
	public static void featureOptions() {
		System.out.println("Please, write down with comma the feature types (ex. 1,2):");
	}
	
	public static void showParcelCost(double cost) {
		System.out.println("Parcel cost is: " + cost + "$.");
	}
	
	public static void showTotalCost(double totalCost) {
		System.out.println("Total cost of all parcels is: " + totalCost + "$.");
	}
	
	public static void quit() {
		System.out.println("Good bye!");
	}
}
