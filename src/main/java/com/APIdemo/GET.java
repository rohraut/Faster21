package com.APIdemo;

import static io.restassured.RestAssured.given;


public class GET {
	
	//given->Details which we already have(header,body)
			//when->Action get,put,post,delete,End-point/URL
			//then->Response(Response body,Response Header,Status Code) and we can perform Assertion only on "then"
			
	public static void main(String[] args) {
		given()
		.when()
		.get("http://216.10.245.166/Library/GetBook.php?AuthorName=somename")
		.then()
		.log()
		.all();

	}

}
