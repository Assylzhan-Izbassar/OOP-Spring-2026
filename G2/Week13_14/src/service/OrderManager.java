package service;

import java.util.ArrayList;
import java.util.List;

import model.Drink;
import model.IDrink;
import model.Order;
import pattern.IObserver;
import pattern.PaymentMethod;

public class OrderManager {
	private static OrderManager INSTANCE = new OrderManager(); 
	private List<Order> orders;
	private List<IObserver> subscribers;
	
	private ArrayList<Drink> tempDrink;
	
	{
		this.orders = new ArrayList<Order>();
		this.subscribers = new ArrayList<IObserver>();
		
		this.tempDrink = new ArrayList<Drink>();
	}
	
	private OrderManager() {}

	public List<Order> getOrders() {
		return orders;
	}

	public static OrderManager getINSTANCE() {
		return INSTANCE;
	}
	
	public List<IObserver> getSubscribers() {
		return subscribers;
	}
	
	public boolean subscribe(IObserver o) {
		if (o != null) {
			this.subscribers.add(o);
			return true;
		}
		return false;
	}
	
	public boolean unsubscribe(IObserver o) {
		if (o != null) {
			for (IObserver item: this.subscribers) {
				if (item.equals(o)) {
					this.subscribers.remove(o);
					return true;
				}
			}
		}
		return false;
	}
	
	public void notifySubscribers(String message) {
		for (IObserver item: this.subscribers) {
			item.update(message);
		}
	}
	
	public void createOrder(PaymentMethod method) throws CloneNotSupportedException {
		ArrayList<Drink> cloned = new ArrayList<Drink>();
		for (Drink d: this.tempDrink) {
			cloned.add((Drink) d.clone());
		}
		Order newOrder = new Order(cloned, method);			
		this.orders.add(newOrder);
		
		this.tempDrink.clear();
		
		// send message
		this.notifySubscribers("The new order is added: " + newOrder);
	}
	
	public void addToOrder(Drink d) {
		if (d != null) {
			tempDrink.add(d);
		}
	}
	public void removeFromOrder(IDrink d) {
		if (d != null) {
			for (IDrink item: this.tempDrink) {
				if (item.equals(d)) {
					this.tempDrink.remove(item);
					break;
				}
			}
		}
	}
	
	public void printOrders() {
		System.out.println("\nOrders: ");
		
		for (Order o: this.orders) {
			System.out.println("Order: " + o);
		}
	}

}
