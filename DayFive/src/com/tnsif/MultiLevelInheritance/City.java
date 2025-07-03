package com.tnsif.MultiLevelInheritance;

//child of state
public class City extends State
{
	
	private String CityName;
	private float Area;
	
	//getter setter
	
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public float getArea() {
		return Area;
	}
	public void setArea(float area) {
		Area = area;
	}
	
	//to string -- including state members and country members
	@Override
	public String toString() {
		return "City [CityName=" + CityName + ", Area=" + Area + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + ", getCountryname()=" + getCountryname() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
	
	
	

}
