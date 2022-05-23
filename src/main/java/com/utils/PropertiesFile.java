package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//This class is made to read OR.properties file
public class PropertiesFile {

	public static String getValue(String filepath, String key) throws IOException {

		String baseDir = System.getProperty("user.dir");

		FileInputStream fis = new FileInputStream(baseDir + filepath);

		Properties pr = new Properties();
		pr.load(fis);
		String value = pr.getProperty(key);
		return value;

	}

}
