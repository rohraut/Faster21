package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {
	/**
	 * This method returns the app_url present in the environment.properties file
	 * @throws IOException 
	 */
	public static String getAppUrl() throws IOException {
		String baseDir = System.getProperty("user.dir");
		//System.out.println("Base DIR: " + baseDir);
		FileInputStream fis = new FileInputStream(baseDir+"/src/main/resources/environment.properties");// to read properties file
		Properties pr = new Properties();// to handle properties file
		pr.load(fis);
		String value = pr.getProperty("app_url");
		return value;
		
	}

	
}
