package com.tnsif.dayeight.abstractionclassification;

public class Square extends Shape {
	
	float side;
	
	
	
	public Square() {
		this.side=2.0f;
	}

	public Square(float side) {
		super();
		this.side= side;
	}
	
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	public void calArea() {
		
		this.area=side*side;
	}

	
	

}
