package com.home;

public class classChild extends classParent{
	
	public classChild(String pName, int pNumber) {
		super(pName,pNumber);
		this.pName = pName;
		this.pNumber = pNumber;
	}


    int cvar = 200;
	String pName;
	int pNumber;
	int childvar = 100;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		System.out.println("Setting child PName to " + pName);
		this.pName = pName;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	
	
	
	
	  public void show() { System.out.println("From Child");
	  System.out.println(getpNumber() +" "+getpName()); }
	 
	 
	 
}
