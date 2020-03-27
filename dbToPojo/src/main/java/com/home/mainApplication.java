package com.home;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.entity.emp;

public class mainApplication {
	
	
// Connect to Db Fetch data and convert to Java OBject followed by conversion to JSON	
	
public static void main(String[] args) throws IOException {

	JdbcTemplate jdbc;
	
	jdbc = new JdbcTemplate(datasource.getdataSource());
	//ResultSet rs = jdbc.execute("select * from emp");	
	
	List<emp> employee =jdbc.query("select * from emp", new RowMapper<emp>() {

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
	
	
	ObjectMapper Mapper = new ObjectMapper();
	System.out.println(Mapper.writeValueAsString(employee));;
	Mapper.writeValue(new File("emp.json"), employee);
	
	}

	
	
	
}
