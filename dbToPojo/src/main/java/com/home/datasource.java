package com.home;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class datasource {
	
	public static String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	public static  String USER = "sys as sysdba";
	public static  String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static String PASSWORD = "madan123";

	public static DataSource getdataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(URL);
		driverManagerDataSource.setUsername(USER);
		driverManagerDataSource.setPassword(PASSWORD);
		driverManagerDataSource.setDriverClassName(DRIVER);
		return driverManagerDataSource;
	}

}
