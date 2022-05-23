package com.assingment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class Assingment2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:/Users/rohan/Downloads/Dashboard.json");//for file reading
		JsonPath js = new JsonPath(fis);
		//String value = js.getString("courses.MobileAutomation[0].title");
		String value = js.getString("dashboard.website");
		System.out.println(value);
		
	}

}
