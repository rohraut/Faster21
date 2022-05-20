package com.APIdemo;

import static io.restassured.RestAssured.given;

public class GET {
	public static void main(String[] args) {
		given()
		.when()
		.get("http://216.10.245.166/Library/GetBook.php?AuthorName=somename")
		.then()
		.log()
		.all();

	}

}
