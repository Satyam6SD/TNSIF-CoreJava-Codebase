package com.tnsif.daytwo.operationdemo;

public class OperationDemo {
	public static void main(String[] args) {
		
		//if operator are used before the int on the same line increment or decrement is done
		// if operators are used after the int , increment or decrement is done for the upcoming lines
		
		
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("A and B value before the operator : "
		+ a + " "+ b);
		
		++a;    //10+1 =11
		
		int c= ++a + b + a--;   //  a=11+1=12   b=20   
		System.out.println("C value after the operation : "+ c);
		
		//a-- meanse subtracting minus -1 for the next line 
		
		int d= c++ + a + b--;   //c=44 a=11 b=20
		System.out.println("D value after the operation : "+ d);
	}

}
