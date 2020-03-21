package com.home;

public class classParent {
	
	classParent(){
		
	}
    int cvar = 2000;

	String pName;
	int pNumber;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	
	
	public void show() {
		System.out.println("From Parent");
		System.out.println(getpNumber() +" "+getpName());
	}
	public classParent(String pName, int pNumber) {
		super();
		this.pName = pName;
		this.pNumber = pNumber;
	}
	
	
	
	
}
