package restapi;

import static io.restassured.RestAssured.given;

public class Post {
	public static void main(String[] args) {
		given()
		.header("Content-Type","application/json")
	    .header("Authorization","Bearer 2dae294e29123c15223a8a4d78543f46b2fae9291391f53abfcfc20843e3f3d5")
	    .body("{" +
	            "    \"name\": \"rohitraut\"," +
	            "    \"gender\": \"male\"," +
	            "    \"email\": \"rohitraut031097@gmail.com\"," +
	            "    \"status\": \"active\"" +
	            "}")
	    .log()
	    .all()
	    .when()
	    .post("https://gorest.co.in/public/v1/users/")
	    .then()
	    .log()
	    .all();
	} 
     
	}


