package com.tnsif.daythree.constructor;

public class Customer {
	
	private String customerName;
	private int customerID;
	private String customerCity;
	
	
	//default constructor
	
	public Customer()
	{
		System.out.println("hello this is default constructor.......");
	}

           //para constructors
	public Customer(String customerName, int customerID, String customerCity) {
		//this ();   //calling default constructor
		
		System.out.println("Hello is this para constructor");
		this.customerName = customerName;
		this.customerID = customerID;
		this.customerCity = customerCity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {  
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerID=" + customerID + ", customerCity="
				+ customerCity + "]";
	}
}
