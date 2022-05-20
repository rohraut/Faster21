package restapi;
import static io.restassured.RestAssured.given;
public class delete {
	public static void main(String[] args) {
		given()
		.log()
		.all()
		
		.when()
		.delete("https://gorest.co.in/public/v1/users/2739")
		.then()
		.log()
		.all();
	}
}
