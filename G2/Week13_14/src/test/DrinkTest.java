package test;

import model.Drink;
import model.DrinkType;
import model.IDrink;
import model.Logger;
import model.UI;
import pattern.DrinkFactory;
import pattern.MilkDecorator;
import service.CashPayment;
import service.OrderManager;

public class DrinkTest {

	public static void main(String[] args) throws CloneNotSupportedException {
//		IDrink coffee = new Coffee();
//		IDrink tea = new Tea();
		
		IDrink coffee = DrinkFactory.getDrink(DrinkType.COFFEE);
		IDrink tea = DrinkFactory.getDrink(DrinkType.TEA);
		
		IDrink coffeeWithMilk = new MilkDecorator(coffee);
		IDrink teaWithMilk = new MilkDecorator(tea);
		
		System.out.println(coffee.description() + " " + coffee.cost() + " KZT");
		System.out.println(tea.description() + " " + tea.cost() + " KZT");
		
		System.out.println(coffeeWithMilk.description() + " " + coffeeWithMilk.cost() + " KZT");
		System.out.println(teaWithMilk.description() + " " + teaWithMilk.cost() + " KZT");
		
//		OrderManager om = new OrderManager();
//		om.getOrders(); // access the list;
		OrderManager.getINSTANCE().subscribe(new Logger());
		OrderManager.getINSTANCE().subscribe(new UI());
		
		OrderManager.getINSTANCE().addToOrder((Drink) teaWithMilk);
		OrderManager.getINSTANCE().addToOrder((Drink) coffee);
		OrderManager.getINSTANCE().createOrder(new CashPayment());
		
		OrderManager.getINSTANCE().printOrders();
	}

}
