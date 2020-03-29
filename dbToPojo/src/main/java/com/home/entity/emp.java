package com.home.entity;

import lombok.Data;

@Data
public class emp {
	
	public String EMPNO;
	public String ENAME;
	public String JOB;
	public String MGR;
	public String HIREDATE;
	public String SAL;
	public String COMM;
	public String DEPTNO;
	
	
	public emp() {
		
	}
	
	public emp(String eMPNO, String eNAME, String jOB, String mGR, String hIREDATE, String sAL, String cOMM,
			String dEPTNO) {
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
