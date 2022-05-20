package com.APIdemo;

import static io.restassured.RestAssured.given;

public class Rest1 {
	public static void main(String[] args) {
		//given()
		//.when()//"when" madhe "get"ahe to perform action
		//.get("https://gorest.co.in/public/v2/users/2632")
		//.then()
		//.log()
		//.all();
		
		
		given()//inputs like body,headers etc we add in "given"method
		.header("Content-Type","application/json")
		.header("Authorization","Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
		.body("{\r\n"
				+ "    \"name\": \"Rohan Raut\",\r\n"
				+ "    \"gender\": \"male\",\r\n"
				+ "    \"email\": \"rsbmann@xyz.com\",\r\n"
				+ "    \"status\": \"active\"}")
		
		.log().all()//inputs chi details console vr disel yani
		
		
		.when()//Action perform hoil yani 
		.post("https://gorest.co.in/public/v1/users/")//we add post method in "when"method for creating data 
		
		.then().log().all();//Output console vr disel yani
		

	}

}
