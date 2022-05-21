package com.assingment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class Assignment1 {
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fis = new FileInputStream("C:/Users/rohan/Downloads/Dashboard.json");
		JsonPath js = new JsonPath(fis);
		String title = js.getString("courses.webautomation.price");
		String title1 = js.getString("courses.api.price");
		String title2 = js.getString("courses.MobileAutomation.price");

		System.out.println(title);
		System.out.println(title1);
		System.out.println(title2);

	}
	public static void r1() {
		System.out.println("good evening");
}
}