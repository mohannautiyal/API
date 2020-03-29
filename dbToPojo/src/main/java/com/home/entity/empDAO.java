package com.home.entity;

import org.springframework.jdbc.core.JdbcTemplate;

import com.home.datasource;

public class empDAO {

	public static JdbcTemplate jdbc = new JdbcTemplate(datasource.getdataSource());

	public static void saveEmp(emp emp) {

		String insertQuery = "insert into emp values(" +"'"+ emp.getEMPNO() + "','" + emp.getENAME() + "','" + emp.getJOB()
				+ "','" + emp.getMGR() + "','"+emp.getHIREDATE()+"','"+emp.getSAL()+"','"+emp.getCOMM()+"','"+emp.getDEPTNO()+")";
		
		System.out.println(insertQuery);
		jdbc.execute(insertQuery);

	}

}
