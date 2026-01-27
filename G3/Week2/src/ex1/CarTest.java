package ex1;

public class CarTest {
	public static void main(String[] args) {
		Car taxiCar = new Car(); // instance of class - object
		taxiCar.color = "Yellow";
		taxiCar.maxSpeed = 60;
		
		Car ambulance = new Car();
		ambulance.color = "White";
		
		System.out.println(taxiCar.speed);
//		System.out.println(ambulance.color);
		
		for (int t=0; t < 10; ++t) {
			if (t < 5) {
				taxiCar.accelarate();
			} else {
				taxiCar.brake();
			}
		}
		System.out.println(taxiCar.speed);
		
//		String taxiCarColor = "Yellow";
//		String ambulanceColor = "White";
	}
}
