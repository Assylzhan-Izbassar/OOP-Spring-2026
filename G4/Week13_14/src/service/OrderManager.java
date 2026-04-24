package service;

import java.util.ArrayList;
import java.util.List;

import model.Drink;
import model.Order;
import pattern.Observer;
import pattern.PaymentMethod;

public class OrderManager { // Singleton, Publisher
	private List<Order> orders;
	private final static OrderManager INSTANCE = new OrderManager();
	private List<Observer> subscribers;

	private List<Drink> currDrinks;
	
	{
		this.orders = new ArrayList<Order>();
		this.subscribers = new ArrayList<Observer>();
		
		this.currDrinks = new ArrayList<Drink>(); 
	}
	
	private OrderManager() {}
	
	public static OrderManager getInstance() {
		return OrderManager.INSTANCE;
	}
	
	@SuppressWarnings("unchecked")
	public boolean createOrder(PaymentMethod method) {
		if (method != null && !this.currDrinks.isEmpty()) {
			List<Drink> cloned = (ArrayList<Drink>)((ArrayList<Drink>) this.currDrinks).clone();
			Order newOrder = new Order(cloned, method);
			this.orders.add(newOrder);
			
			this.currDrinks.clear();
			
			this.notifySubscribers("The " + newOrder + " is added to queue, and paid with " + method + ".");
 		}
		return false;
	}
	
	public boolean addToOrder(Drink drink) {
		if (drink != null) {
			this.currDrinks.add(drink);
			return true;
		}
		return false;
	}
	
	public void printOrder() {
		System.out.println("\nOrders:");
		int i = 1;
		for (Order d: this.orders) {
			System.out.println(i + ") " + d);
			i++;
		}
	}
	
	public boolean subscribe(Observer o) {
		if (o != null) {
			this.subscribers.add(o);
			return true;
		}
		return false;
	}
	
	public boolean unsubscribe(Observer o) {
		if (o != null) {
			for (Observer item: this.subscribers) {
				if (item.equals(o)) {
					this.subscribers.remove(o);
					return true;
				}
			}
		}
		return false;
	}
	
	public void notifySubscribers(String message) {
		for (Observer o: this.subscribers) {
			o.update(message);
		}
	}

	public List<Order> getOrders() {
		return orders;
	}

	public List<Observer> getSubscribers() {
		return subscribers;
	}
}
