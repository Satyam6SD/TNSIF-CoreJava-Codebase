package com.tnsif.dayeight.abstractionclassification;

public abstract class Shape {
	
	protected float area;
	
	//abstract class
	public abstract void calArea();
		

	
	//solid method
	
	public void show()
	{
		System.out.println("Area of the shape is :"+area);
	}

}
