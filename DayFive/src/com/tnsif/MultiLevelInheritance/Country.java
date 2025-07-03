package com.tnsif.MultiLevelInheritance;

public class Country 
{

	private String countryname;
	private String capital;
	
	//getter setter
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//to string
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capital=" + capital + "]";
	}
	
	
	
}
