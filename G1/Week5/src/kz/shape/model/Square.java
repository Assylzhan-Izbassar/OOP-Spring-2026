package kz.shape.model;

public class Square extends Rectangle {
	
	public Square(double width) {
		super(width, width);
	}

//	public Square(double height, double width) {
//		super(height, width);
//	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	
	@Override
	public void setHeight(double height) {
		super.setWidth(height);
		super.setHeight(height);
	}
	
}
