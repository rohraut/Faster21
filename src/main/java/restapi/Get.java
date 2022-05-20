package restapi;

import static io.restassured.RestAssured.given;

public class Get {
	public static void main(String[] args) {
		
     given()
     .when()
     .get("https://gorest.co.in/public/v2/users/2632")
     .then()
     .log()
     .all();
}
}