package com.home.entity;

import lombok.Data;

@Data
public class emp {
	
Integer EMPNO;
String ENAME;
String JOB;
Integer MGR;
String HIREDATE;
Integer SAL;
Integer COMM;
Integer DEPTNO;

public emp() {
	
}

public emp(Integer eMPNO, String eNAME, String jOB, Integer mGR, String hIREDATE, Integer sAL, Integer cOMM,
		Integer dEPTNO) {
	super();
	EMPNO = eMPNO;
	ENAME = eNAME;
	JOB = jOB;
	MGR = mGR;
	HIREDATE = hIREDATE;
	SAL = sAL;
	COMM = cOMM;
	DEPTNO = dEPTNO;
}



}
