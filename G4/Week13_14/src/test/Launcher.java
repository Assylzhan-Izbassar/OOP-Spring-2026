package test;

import model.Drink;
import model.DrinkType;
import model.IDelivery;
import model.Logger;
import model.UI;
import pattern.DeliveryAdapter;
import pattern.DrinkFactory;
import pattern.DrinkMilkDecorator;
import pattern.DrinkSugarDecorator;
import service.CashPayment;
import service.DeliveryService;
import service.OrderManager;

public class Launcher {

	public static void main(String[] args) {
//		Drink c1 = new Coffee();
//		Drink t1 = new Tea();
		
		Drink c1 = DrinkFactory.getDrink(DrinkType.COFFEE); 
		Drink t1 = DrinkFactory.getDrink(DrinkType.TEA); 
		
		DrinkMilkDecorator c2 = new DrinkMilkDecorator(c1);
		DrinkSugarDecorator c3 = new DrinkSugarDecorator(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(t1);
		
		OrderManager.getInstance().subscribe(new Logger());
		OrderManager.getInstance().subscribe(new UI());
		
		OrderManager.getInstance().addToOrder(c2);
		OrderManager.getInstance().addToOrder(c3);
		
		OrderManager.getInstance().createOrder(new CashPayment());
		
		OrderManager.getInstance().printOrder();
		
		IDelivery delivery = new DeliveryAdapter();
		delivery.delivery("Tole bi, 59");
		
//		DeliveryService ds = new DeliveryService();
//		ds.sendPackage("Tole bi 59");
		
//		OrderManager om = new OrderManager();
//		om.addOrder(c3); 
//		System.out.println(om.getOrders());
//		OrderManager om2 = new OrderManager();
//		om2.addOrder(c2);
//		om2.addOrder(c3); 
//		System.out.println(om2.getOrders());

	}

}
