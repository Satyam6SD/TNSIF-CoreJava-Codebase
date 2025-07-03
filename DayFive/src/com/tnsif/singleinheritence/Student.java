package com.tnsif.singleinheritence;


//child class
public class Student extends Citizen {
	
	//data members
	
	private int rollNO;
	private String collegeName;
	
	//non para constructor
	public Student() {
		super();
	}
	
	
	
    // para constructors
	
	public Student(String name, String adharNo, String address, long phone, int rollNO, String collegeName)
	{
		super( name, adharNo, address, phone);
		this.rollNO = rollNO;
		this.collegeName = collegeName;
	}
	
      //getter setter
	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
	
    //to string
	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
	
	

}
