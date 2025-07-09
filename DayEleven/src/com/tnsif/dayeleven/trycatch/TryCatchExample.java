package com.tnsif.dayeleven.trycatch;

public class TryCatchExample {
	
	static void performDivision(int x, int y)
	{
		System.out.println("i am in method");
		int z;
		try 
		{
			System.out.println("i am in gtry block");
		
		z=x/y;
		System.out.println("Result of z :"+ z);
		}
		catch (ArithmeticException e)	
		{
			System.err.println("i am in catch bloack : cant divide it by 0");	
		}
	}
}
	
