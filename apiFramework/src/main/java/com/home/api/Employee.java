package com.home.api;

public class Employee {
	
int id;
String name;
String username;
String email;

address address;
String phone;
String website;
company company;




@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address="
			+ address + ", phone=" + phone + ", website=" + website + ", company=" + company + "]";
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

public company getCompany() {
	return company;
}

public void setCompany(company company) {
	this.company = company;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public address getAddress() {
	return address;
}

public void setAddress(address address) {
	this.address = address;
}

	

}
