package com.home.db;

import java.io.IOException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.home.utilities.readProperty;


public class dataSource {

	public static readProperty readProperty;
	public static DriverManagerDataSource dataSource = new DriverManagerDataSource();

	public static DriverManagerDataSource getDataSource() {

		try {
			System.out.println("Inside DataSource" );

			dataSource.setDriverClassName(readProperty.readProp("driverClassName"));
			dataSource.setUrl(readProperty.readProp("url"));
			dataSource.setUsername(readProperty.readProp("username"));
			dataSource.setPassword(readProperty.readProp("password"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return dataSource;
	}

	
}
