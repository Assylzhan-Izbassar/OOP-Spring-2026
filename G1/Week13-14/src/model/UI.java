package model;

import pattern.Observer;

public class UI implements Observer {

	@Override
	public void update(String message) {
		System.out.println("UI: " + message);
	}
}
