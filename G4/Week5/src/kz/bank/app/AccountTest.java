package kz.bank.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import kz.bank.model.Account;
import kz.bank.model.CheckingAccount;
import kz.bank.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount("KZ1348295");
		CheckingAccount c1 = new CheckingAccount("KZ48543785379");
		CheckingAccount c2 = new CheckingAccount("KZ48543785379");
		
//		Account a1 = s1; // declare
		Account a1 = (Account) s1; // declare
		Account a2 = c1; // widening conversion
		
		a1.deposit(1000);
		a2.deposit(2000);
		
//		System.out.println(a1.getBalance());
//		a1.transaction(a2, 400);
//		System.out.println(a1.getBalance());
//		System.out.println(a2.getBalance());
//		a2.transaction(a1, 400);
//		System.out.println(a2.getBalance());
		
		HashSet<Account> hs = new HashSet<Account>();
		hs.add(a1);
		hs.add(a2);
		hs.add(s1);
		hs.add(c1);
		hs.add(c2);
		
		for (Account x: hs) {
			System.out.println(x);
		}
		
		
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(a1);
		accounts.add(a2);
		
//		for (Account x: accounts) {
//			x.processMonthly();
//			System.out.println(x.getBalance());
//		}
		
//		if (a1 instanceof SavingAccount) {			
//			SavingAccount s3 = (SavingAccount) a1; // narrowing casting
//		} 
//		if (a2 instanceof CheckingAccount) {			
//			CheckingAccount s4 = (CheckingAccount) a2;
//		}
		
//		
//		System.out.println(SavingAccount.class.getName());
//		System.out.println(a1.getClass().getName());
//		if (a1.getClass().getName().equals(SavingAccount.class.getName())) {
//			System.out.println("Equal!");
//		}
	}

}
