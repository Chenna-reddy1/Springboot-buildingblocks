package com.example.demo.User;

public class UserDetails {

	private String firstname;
	private String Lastname;
	private String City;
	
	public UserDetails(String firstname, String lastname, String city) {
		super();
		this.firstname = firstname;
		Lastname = lastname;
		City = city;
	}
	
	@Override
	public String toString() {
		return "UserDetails [firstname=" + firstname + ", Lastname=" + Lastname + ", City=" + City + "]";
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	
}
