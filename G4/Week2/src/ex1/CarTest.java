package ex1;

public class CarTest {
	public static void main(String[] args) {
		Car c1; // declaring the Object / instance of Car
		c1 = new Car(); // creating of the Object of Car
		
		Car taxiCar = new Car("Yellow");
//		taxiCar.color = "Yellow";
//		taxiCar.setColor("Yellow");
		
		Car ambulance = new Car();
//		ambulance.color = "White";
		
		Car f1 = new Car(300, "Red");
		
		for (int t=0; t < 5; ++t) {
			if (t < 2) {
				taxiCar.accelerate();
			} else {
				taxiCar.brake(); 
			}
		}
		
		System.out.println(taxiCar.getColor());
		System.out.println(f1.getColor());
		System.out.println(f1.speed);
		System.out.println(taxiCar.speed);
//		System.out.println(ambulance.color);
	}
}
