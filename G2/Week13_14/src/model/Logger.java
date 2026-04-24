package model;

import pattern.IObserver;

public class Logger implements IObserver {

	@Override
	public void update(String message) {
		System.out.println("LOG: " + message);
	}
	
}
