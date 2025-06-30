package com.tnsif.dayone;

public class DataTypeDemo {
	
	public static void main(String[] args) {
		
		int value1 = 9/2;   //integer division
		System.out.println(value1);      // memory used 4 bytes
		
		float value2= 101f/61f;        //memory used 4 bytes
		System.out.println(value2);
		
		double value3= 10d/6d;          // memory used 8 bytes
		System.out.println(value3);
		
		int radius=10;
		double percentage =  3.14 * radius * radius;
		System.out.println("Area of Circle:"+ percentage);
		
		
		
	}

}
