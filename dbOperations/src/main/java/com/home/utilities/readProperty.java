package com.home.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readProperty {

	public static Properties prop = new Properties();

	public static String readProp(String propertyName) throws IOException {

		InputStream input;
		input = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/db.properties");
		prop.load(input);
		return prop.getProperty(propertyName);

	}
	
	}
