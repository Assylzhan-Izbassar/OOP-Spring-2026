package pattern;

import java.util.ArrayList;
import java.util.List;

import model.IDrink;
import model.Order;

public class OrderManager {
	private List<Order> orders;
	private List<Observer> subscribers;
	private static OrderManager INSTANCE = new OrderManager();
	
	private Order currOrder;
	
	{
		this.orders = new ArrayList<Order>();
		this.subscribers = new ArrayList<Observer>();
	}
	
	private OrderManager() {}
	
	public static OrderManager getInstance() {
		return INSTANCE;
	}
	
	public List<Order> getOrders() {
		return this.orders;
	}
	
	public void createOrder(PaymentMethod method) {
		this.currOrder = new Order(method);
	}
	
	public void addDrink(IDrink drink) {
		this.currOrder.addDrink(drink);
		this.notifySubscribers("Added new drink: " + drink + " in order " + this.currOrder);
	}
	
	public void saveOrder() throws CloneNotSupportedException {
		this.orders.add((Order) this.currOrder.clone());
		
		this.notifySubscribers("Added new order: " + this.currOrder);
	}
	
	public void addSubscriber(Observer o) {
		if (o != null) {
			this.subscribers.add(o);
		}
	}
	
	public void removeSubscriber(Observer o) {
		for (Observer c: this.subscribers) {
			if (c.equals(o)) {
				this.subscribers.remove(c);
				break;
			}
		}
	}
	
	public void notifySubscribers(String message) {
		for (Observer o: this.subscribers) {
			o.update(message);
		}
	}
}
