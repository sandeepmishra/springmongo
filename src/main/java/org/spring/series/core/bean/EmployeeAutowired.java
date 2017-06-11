package org.spring.series.core.bean;

public class EmployeeAutowired {



	private String name;
	private String age;
	private String employeeCode;
	private String designation;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: "+name+" age: "+age+" designation "+designation+"\n"+
		"Address "+address.getAddressLine1()+" city "+address.getCity()+" state "+address.getState()+" zip "+address.getZip();
	}

}
