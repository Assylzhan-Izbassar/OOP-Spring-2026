package kz.bank.app;

import java.util.HashSet;

import kz.bank.model.Account;
import kz.bank.model.CheckingAccount;
import kz.bank.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount("KZ51547321", 1.4);
		Account a = (Account) s1; // widening conversion
		
		CheckingAccount c1 = new CheckingAccount("KZ512345325", 200);
		Account a2 = c1; // widening conversion
		CheckingAccount c3 = new CheckingAccount("KZ512345325", 200);
		
		HashSet<Account> hs = new HashSet<Account>();
		hs.add(s1);
		hs.add(a);
		hs.add(c1);
		hs.add(a2);
		hs.add(c3);
		
		for (Account x: hs) {
			System.out.println(x);
		}
		
		System.out.println();
		
		
		// narrowing conv. working in run-time, not in compile time!
		if (a2 instanceof SavingAccount) { // type checking			
			SavingAccount s2 = (SavingAccount) a2;
			System.out.println(s2);
		} else if (a2 instanceof CheckingAccount) {
			CheckingAccount c2 = (CheckingAccount) a2;
			System.out.println(c2);			
		}
		
		if (a2.getClass().getName().contains(CheckingAccount.class.getName())) {
			CheckingAccount c2 = (CheckingAccount) a2;
			System.out.println(c2);	
		}
		
		
		System.out.println(a2.getClass().getName());
		System.out.println(CheckingAccount.class.getName());
		
	}

}
