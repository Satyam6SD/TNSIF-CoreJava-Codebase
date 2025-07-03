package com.tnsif.MultiLevelInheritance;


// child of country
public class State extends Country 
{
	
	//data memebers
	private String stateName;
	private String language;
	
	// getter setter
	
	public String getStatename() {
		return stateName;
	}
	public void setStatename(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	// to string include parent data memebers
	
	@Override
	public String toString() {
		return "State [Statename=" + stateName + ", language=" + language + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	

}
