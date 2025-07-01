package com.tnsif.daytwo.JumpDemo;

import java.util.Iterator;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for(int k=-15; k<15; k++)
		{
			//odd no skipped
			if(k%2 !=0)
				continue;
			//even no are printed
			System.out.println(k + "");
			
		}

	}

}
