package test;

import model.DrinkType;
import model.IDrink;
import model.Logger;
import model.MilkDecorator;
import model.UI;
import pattern.CardPayment;
import pattern.DrinkFactory;
import pattern.OrderManager;

//import model.Coffee;
//import model.Tea;

public class DrinkTest {

	public static void main(String[] args) throws CloneNotSupportedException {
//		Coffee c = new Coffee();
//		Tea tea = new Tea();
		
		IDrink coffee = DrinkFactory.createDrink(DrinkType.COFFEE);
		IDrink tea = DrinkFactory.createDrink(DrinkType.TEA);
		
		System.out.println(coffee.cost());
		System.out.println(tea.cost());
		
		MilkDecorator coffeeMilk = new MilkDecorator(coffee);
		System.out.println(coffeeMilk.cost());
		
//		OrderManager om = new OrderManager();
		System.out.println("Orders:");
		
		OrderManager.getInstance().addSubscriber(new Logger());
		OrderManager.getInstance().addSubscriber(new UI());
		OrderManager.getInstance().addSubscriber(new UI());
		
		OrderManager.getInstance().createOrder(new CardPayment());
		OrderManager.getInstance().addDrink(coffeeMilk);
		OrderManager.getInstance().addDrink(tea);
		
		OrderManager.getInstance().saveOrder();
		
		for (Object o: OrderManager.getInstance().getOrders()) {
			System.out.println(o);
		}
	}

}
