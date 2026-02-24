package l6.logistics.service;

public final class Message {
	public static void welcome() {
		System.out.println("Welcome to system!");
		System.out.println("Please, enter your option:");
	}
	
	public static void close() {
		System.out.println("Good bye!");
	}
	
	public static void mainOptions() {
		System.out.println("1 - Create parcel;");
		System.out.println("2 - Calculate the total cost;");
		System.out.println("3 - Customers");
		System.out.println("4 - Quit");
	}
	
	public static void customerName() {
		System.out.println("Please, enter fullname:");		
	}
	
	public static void parcelWeight() {
		System.out.println("Please, enter weight:");		
	}
	
	public static void parcelAddress() {
		System.out.println("Please, enter address:");		
	}
	
	public static void parcelType() {
		System.out.println("Please, choose parcel type:");		
	}
	
	public static void parcelTypeOptions() { 
		System.out.println("1 - Ground parcel");
		System.out.println("2 - Air parcel");
		System.out.println("3 - Drone parcel");
	}
	
	public static void printCost(double parcelCost) {
		System.out.println("The parcel cost will be " + parcelCost + "$");
	}
	
	public static void isFeatures() {
		System.out.println("Do you add some features?");
	}
	
	public static void featureOptions() {
		System.out.println("1 - Insured");
		System.out.println("2 - Fragile");
	}
}
