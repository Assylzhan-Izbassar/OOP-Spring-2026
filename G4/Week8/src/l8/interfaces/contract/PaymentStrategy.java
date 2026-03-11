package l8.interfaces.contract;

public interface PaymentStrategy<T> {
	boolean pay(T account, double amount);
}
