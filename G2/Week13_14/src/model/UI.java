package model;

import pattern.IObserver;

public class UI implements IObserver {

	@Override
	public void update(String message) {
		System.out.println("UI: " + message);
	}

}
