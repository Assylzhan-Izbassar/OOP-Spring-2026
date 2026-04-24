package model;

import pattern.Observer;

public class Logger implements Observer {

	@Override
	public boolean update(String message) {
		if (!message.isEmpty()) {
			System.out.println("Logger: " + message);
			return true;
		}
		return false;
	}

}
