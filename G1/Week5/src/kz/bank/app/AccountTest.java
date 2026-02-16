package kz.bank.app;

import java.util.HashSet;

import kz.bank.model.Account;
import kz.bank.model.CheckingAccount;
import kz.bank.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		HashSet<Account> hs = new HashSet<Account>();
		
		Account a = new CheckingAccount(200); // Widening conversion
		Account b = new SavingAccount(1.4); // Widening
		Account c = new SavingAccount(1.4); // Widening
		
		hs.add(a);
		hs.add(b);
		hs.add(c);
		
		for (Account x: hs) {
			System.out.println(x);
		}
		
		
		b.deposit(2000);
		System.out.println(b.getBalance());
		b.payment(a, 100);
		System.out.println(a.getBalance());
		
		a.deposit(900);
		System.out.println(a.getBalance());
		a.payment(b, 100);
		System.out.println(b.getBalance());
		
		if (a instanceof CheckingAccount) {
			CheckingAccount c1 = (CheckingAccount) a; // Narrowing conversion	
			System.out.println(c1.getBalance());
		}
		
//		CheckingAccount c2 = (CheckingAccount) b; // Narrowing conversion
		
	}

}
