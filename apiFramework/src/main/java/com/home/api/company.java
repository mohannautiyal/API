package com.home.api;

public class company {
	
	String name;
	String catchPhrase;
	String bs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	public String getBs() {
		return bs;
	}
	public void setBs(String bs) {
		this.bs = bs;
	}
	@Override
	public String toString() {
		return "company [name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
	}

}
