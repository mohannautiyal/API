package com.home;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.entity.emp;
import com.home.entity.empDAO;

public class mainApplication {

// Connect to Db Fetch data and convert to Java OBject followed by conversion to JSON	

	public static void main(String[] args) throws IOException {

		JdbcTemplate jdbc;

		jdbc = new JdbcTemplate(datasource.getdataSource());
		// ResultSet rs = jdbc.execute("select * from emp");

		System.out.println("========================= Object from Row Mapper =======================================");

		List<emp> employee = jdbc.query("select * from emp", new RowMapper<emp>() {

			public emp mapRow(ResultSet rs, int rowNum) throws SQLException {

				emp e = new emp();
				e.setEMPNO(rs.getString("EMPNO"));
				e.setENAME(rs.getString("ENAME"));
				e.setJOB(rs.getString("JOB"));
				e.setMGR(rs.getString("MGR"));
				e.setHIREDATE(rs.getString("HIREDATE"));
				e.setSAL(rs.getString("SAL"));
				e.setCOMM(rs.getString("COMM"));
				e.setDEPTNO(rs.getString("DEPTNO"));

				return e;
			}

		});

		System.out.println(employee);

		System.out.println("========================= Json String =======================================");

		ObjectMapper Mapper = new ObjectMapper();
		System.out.println(Mapper.writeValueAsString(employee));
		Mapper.writeValue(new File("emp.json"), employee);

		// Bean Property Row mapper to map db results to java object

		System.out.println(
				"========================= Object from Bean Property Row Mapper =======================================");

		List<emp> employeeObj = jdbc.query("select * from emp", new BeanPropertyRowMapper<emp>(emp.class));

		System.out.println(employeeObj);

		System.out.println(employee.equals(employeeObj));


	emp insertEmp = new emp("1234","Madan","Test Lead","None",null,"50000",null,"5467");
	//empDAO.saveEmp(insertEmp);
	
	
	}

}
