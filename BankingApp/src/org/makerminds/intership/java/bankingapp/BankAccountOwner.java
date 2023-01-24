package org.makerminds.intership.java.bankingapp;

public class BankAccountOwner {

	private String name;
	private String address;
	private String email;
	private String phoneNr;

	public BankAccountOwner(String name, String address, String email, String phoneNr) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNr = phoneNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}

}
