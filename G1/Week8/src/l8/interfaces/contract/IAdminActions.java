package l8.interfaces.contract;

public interface IAdminActions {
	boolean addProduct(Object product);
	boolean deleteProduct(Object product);
	String generateRevenueReport();
}
