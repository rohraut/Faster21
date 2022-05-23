package com.assingment2;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

//here we converting Object to JSON i.e Serialization
public class DEF {
	public static void main(String[] args) {

		ABC abc = new ABC();
		abc.setName("C++");
		abc.setIsbn("rohan123");
		abc.setAisle("rdr141");
		abc.setAuthor("Gadwe");

		given()
		//.contentType(ContentType.JSON)
		.log()
		.all()
		.body(abc)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
        .log()
        .all();
	
		//rohan123rdr141

	}

}
