package com.tnsif.daysix.finalDemo;

public class FinalClass {
	
	void show()
	{
		System.out.println("Final class cannot be inherited");
	}
	
	//class student extends final class
	
	public class FinalClassDemo{
		public static void main(String[] args) {
			FinalClass f=new FinalClass();
			f.show();
		}
	}

}
