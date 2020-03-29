package com.home.db;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.home.entity.emp;

public class empDAO {

	static JdbcTemplate template = new JdbcTemplate(dataSource.getDataSource());

	public static List<emp> getRecords() {
		String sql = "Select * from emp";
		return template.query(sql, new BeanPropertyRowMapper<emp>(emp.class));

	}
	
	public static void insertRecords(emp emp) {
		String insertQuery = "Insert into emp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values ("+emp.getEMPNO()+"+'MADAN','PRESIDENT',null,to_date('17-11-81','DD-MM-RR'),5000,null,10);\r\n" + 
				"";
        System.out.println(insertQuery);
		template.execute(insertQuery);;

	}
	
	
	
	
	
	

}
