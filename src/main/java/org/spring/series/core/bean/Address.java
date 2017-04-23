package org.spring.series.core.bean;

public class Address {

	private String addressLine1;
	private String state;
	private String city;
	private String zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String addressLine1, String state, String city, String zip) {
		super();
		this.addressLine1 = addressLine1;
		this.state = state;
		this.city = city;
		this.zip = zip;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address "+addressLine1+" city "+city+" state "+state+" zip "+zip; 
	}
}
