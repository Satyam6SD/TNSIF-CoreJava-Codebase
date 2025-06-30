package com.tnsif.daytwo.decisionmaking;

public class NestedIfElseDemo {
	public static void main(String[] args) {
		
		//todo auto-generated method stub
		
		int a=10, b=20, c=5;
		System.out.println("The largest no is :");
		
		if(a>b )
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(c>b)
			{
				System.out.println(c);
			}
			else
			{
				System.out.println(b);
			}
		}
	}

}
