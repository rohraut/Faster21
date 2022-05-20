package com.APIdemo;

import static io.restassured.RestAssured.given;

public class Delete {
	public static void main(String[] args) {
		given()
		//.log()
		//.all()
		
		.when()
		.delete("http://216.10.245.166/Library/DeleteBook.php/rohan123rdr141")
		.then()
		.log()
		.all();
	}

}
