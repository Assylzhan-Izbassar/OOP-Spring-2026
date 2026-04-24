package pattern;

import java.util.ArrayList;
import java.util.List;

import model.Drink;
import model.Order;

public class OrderManager {
	private static final OrderManager INSTANCE = new OrderManager();
	private static List<Observer> subcribers;
	private List<Order> orders;
	
	private ArrayList<Drink> currOrderDrinks;
	
	{
		this.orders = new ArrayList<Order>();
		subcribers = new ArrayList<Observer>();
		
		this.currOrderDrinks = new ArrayList<Drink>(); 
	}
	
	private OrderManager() {
		
	}
	
	@SuppressWarnings("unchecked")
	public boolean createOrder(PaymentMethod payment) {
		if (payment != null && !this.currOrderDrinks.isEmpty()) {
			ArrayList<Drink> cloned = (ArrayList<Drink>) this.currOrderDrinks.clone();
			Order newOrder = new Order(cloned, payment);
			
			this.orders.add(newOrder);
	
			this.currOrderDrinks.clear();		
			notifySubscribers("A new order is added: " + newOrder);
			
			newOrder.checkout();
			
			notifySubscribers("The order is paid: " + newOrder.getTotalCost());
			
			return true;
		}
		return false;
	}
	
	public boolean addToOrder(Drink d) {
		if (d != null) {
			this.currOrderDrinks.add(d);
			return true;
		}
		return false;
	}
	
	public boolean subscribe(Observer o) {
		if (o != null) {
			subcribers.add(o);
			return true;
		}
		return false;
	}
	
	public boolean unsubscribe(Observer o) {
		if (o != null) {
			for (Observer item: subcribers) {
				if (item.equals(o)) {
					subcribers.remove(o);
					return true;
				}
			}
		}
		return false;
	}
	
	public static void notifySubscribers(String message) {
		for (Observer o: subcribers) {
			o.update(message);
		}
	}
	
	public void printOrders() {
		System.out.println("Orders:");
		for (Order d: this.orders) {
			System.out.println(d);
		}
	}

	public List<Order> getOrders() {
		return orders;
	}

	public static OrderManager getInstance() {
		return INSTANCE;
	}

	public List<Observer> getSubcribers() {
		return subcribers;
	}

	public List<Drink> getCurrOrderDrinks() {
		return currOrderDrinks;
	}
}
