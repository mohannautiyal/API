package com.home.api;


public class emp {
	
	public address getAdd() {
		return add;
	}
	public void setAdd(address add) {
		this.add = add;
	}
	private address add;
	private String EmpId;
	private String EmpName;
	private String Designation;
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}

	

}


