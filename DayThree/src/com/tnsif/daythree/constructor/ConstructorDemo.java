package com.tnsif.daythree.constructor;

import java.util.Scanner;


public class ConstructorDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name,city;
		
		int id;
		System.out.println("Enter Customer ID");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name");
		name=sc.nextLine();
		
		System.out.println("enter city name");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		Customer cus=new Customer();
		
		
		cus.setCustomerCity(city);
		cus.setCustomerID(id);
		cus.setCustomerName(name);
		System.out.println(cus);
		
		Customer c2=new Customer(name,id,city);
		System.out.println(c2.getCustomerCity());
		System.out.println(c2.getCustomerID());
		System.out.println(c2.getCustomerName());
		
		System.out.println("");
		Customer c1=new Customer("Radha",87,"Pune");//parameterised customer is called or createed
				System.out.println(c1);
		
		
		
	}

	public ConstructorDemo() {
		super();
	}

}
