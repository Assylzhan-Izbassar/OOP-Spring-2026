package model;

import pattern.Observer;

public class UI implements Observer {

	@Override
	public boolean update(String message) {
		if (!message.isEmpty()) {
			System.out.println("UI: " + message);
			return true;
		}
		return false;
	}
}
