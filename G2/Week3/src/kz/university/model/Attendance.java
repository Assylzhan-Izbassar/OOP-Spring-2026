package kz.university.model;

import java.time.LocalDate;

public class Attendance {
	private LocalDate date;
	private boolean isAttend;
	
	public Attendance(LocalDate date) {
		this.date = date;
	}
	
	public void attend() {
		this.isAttend = true;
	}

	public LocalDate getDate() {
		return date;
	}

	public boolean isAttend() {
		return isAttend;
	}
	
	public String toString() {
		return this.date.toString() +  " " + this.isAttend();
	}
}
