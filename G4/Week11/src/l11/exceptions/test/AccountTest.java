package l11.exceptions.test;

import l11.exceptions.exception.InsufficientFundsException;
import l11.exceptions.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a = new Account();
		a.balance = 1000; 
		try {
			a.withdraw(15000);
		} catch (InsufficientFundsException e) {
			System.err.println(e.getMessage()); 
		} catch (Exception e) {
			System.err.println(e.getMessage()); 
		}

	}

}
