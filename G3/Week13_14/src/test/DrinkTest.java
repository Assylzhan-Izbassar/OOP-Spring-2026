package test;

import model.Drink;
import model.DrinkType;
import model.Logger;
import model.UI;
import pattern.DrinkFactory;
import pattern.MilkDecorator;
import pattern.OrderManager;
import pattern.SugarDecorator;
import service.CardPayment;
import service.CashPayment;

public class DrinkTest {

	public static void main(String[] args) {
//		Drink coffee = new Coffee();
//		Drink tea = new Tea();
		
		Drink coffee = DrinkFactory.getDrink(DrinkType.COFFEE);
		Drink tea = DrinkFactory.getDrink(DrinkType.TEA);
		
		MilkDecorator coffeeWithMilk = new MilkDecorator(coffee);
		SugarDecorator coffeeWithMilkSugar = new SugarDecorator(coffeeWithMilk);
		
//		System.out.println(coffee);
//		System.out.println(tea);
//		System.out.println(coffeeWithMilk);
//		System.out.println(coffeeWithMilkSugar);
		
//		OrderManager om1 = new OrderManager();
//		OrderManager om2 = new OrderManager();
//		OrderManager om3 = new OrderManager();
		
		// these are subscribers
		OrderManager.getInstance().subscribe(new Logger());
		OrderManager.getInstance().subscribe(new UI());
		
		OrderManager.getInstance().addToOrder(coffee);
		OrderManager.getInstance().addToOrder(tea);
		
		OrderManager.getInstance().createOrder(new CardPayment());
		
		OrderManager.getInstance().addToOrder(coffeeWithMilkSugar);
		OrderManager.getInstance().createOrder(new CashPayment());
		
		OrderManager.getInstance().printOrders();
	}

}
