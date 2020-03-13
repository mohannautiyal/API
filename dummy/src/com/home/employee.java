package com.home;

public class employee implements Comparable {
	
	String empName;
	int empId;
	String dept;
	public employee(String empName, int empId, String dept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.dept = dept;
	}
	
	public String toString() {
		
		return empName+"  " + empId+"  " + dept;
		
	}

	@Override
	public int compareTo(Object o) {
        employee e = (employee)o;
        
        if(e.empName.equals(empName))
        	return 0;
        
        if(e.empName.compareTo(empName) >0 )
        	return -1;
        	else
        	return 1;
        
	}
	}
        
        
		
		
