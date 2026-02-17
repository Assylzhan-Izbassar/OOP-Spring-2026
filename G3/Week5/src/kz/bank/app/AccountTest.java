package kz.bank.app;

import java.util.HashSet;

import kz.bank.model.Account;
import kz.bank.model.CheckingAccount;
import kz.bank.model.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount("KZ48124824928", 1.4);
		Account a = (Account) s1; // polymorphism - widening conversion
		
		CheckingAccount c1 = new CheckingAccount("KZ515327895235");
		Account a2 = (Account) c1;
		
		CheckingAccount c3 = new CheckingAccount("KZ515327895235");
		
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
		
		
		/*
		 * Conversions will always appear at run-time, not the complile-time
		 * */
		if (a instanceof CheckingAccount) {			
			CheckingAccount c2 = (CheckingAccount) a;
		} else if (a instanceof SavingAccount) {
			SavingAccount s2 = (SavingAccount) a; // narrowing conversion
			System.out.println("Converted!");
		}
		
		
		
		a.deposit(1000);
		System.out.println(a.getBalance());
		a.transfer(a2, 500);
		System.out.println(a.getBalance());
		
		System.out.println(a2.getBalance());
		a2.transfer(a, 100);
		System.out.println(a2.getBalance());
	}
}
