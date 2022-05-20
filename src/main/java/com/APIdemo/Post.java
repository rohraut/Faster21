package com.APIdemo;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class Post {
	public static void main(String[] args) {
     given()
     //.header("Content-Type","application/json")//same meaning
     .contentType(ContentType.JSON)//same meaning
     .body("{\r\n"
     		+ "\r\n"
     		+ "\"name\":\"C++\",\r\n"
     		+ "\"isbn\":\"rohan123\",\r\n"
     		+ "\"aisle\":\"rdr141\",\r\n"
     		+ "\"author\":\"Gadwe\"\r\n"
     		+ "}\r\n"
     		+ "}")
     .log()
     .all()
     .when()
     .post("http://216.10.245.166/Library/Addbook.php")
     .then()
     .log()
     .all();
     
     
	}

}
