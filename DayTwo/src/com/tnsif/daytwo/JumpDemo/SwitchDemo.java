package com.tnsif.daytwo.JumpDemo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int userInput=1;
		
		switch(userInput)
		{
		
		case 1 : System.out.println("Current recharge details ");
		break;
		
		case 2 : System.out.println("Current recharge expiry");
		break;
		
		case 3 : System.out.println("New Offers");
		break;
		
		case 4 : System.out.println("Talk to customer support person");
		break;
		
		default:
			System.out.println(userInput + "Is not valid inpput given by you");
		}
		
	}

}
