package com.utils;

import java.io.IOException;

public class OR {
	public static String filePath = "/src/main/resources/OR.properties";
	
	
	public static String AssignmentLocator() throws IOException {
		
		 return PropertiesFile.getValue(filePath,"Assingments");
		

	}

	public static String ConfirmatonAlert() throws IOException {
		
		return PropertiesFile.getValue(filePath,"ConfirmationAlert");
	}

}
