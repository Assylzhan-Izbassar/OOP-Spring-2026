package kz.shape.model;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return this.width * this.height;
	}
	
}
