package com.assingment;
import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

public class Assingment3 {
	public static void main(String[] args) {
		
		
		given()
		.log()
		.all()
		.when()
		.get("https://gorest.co.in/public/v1/users/2624")
		.then()
		.assertThat()//I have a doubt->without adding this method i am able to perform assertion on below 
		.statusCode(200)
		//.body("data.email",Matchers.equalTo("gandhi_giriraaj_i@gulgowski-oreilly.co"))
		//.body("data.id",Matchers.lessThan(500))
		.body("data.id",Matchers.lessThanOrEqualTo(2623))
		.log()
		.all();
		
	}

}
