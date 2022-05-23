package com.assingment;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.http.ContentType;

public class RestTest {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		engine.setPower("HP");
		engine.setCc(2499);
		
		
		ElectronicItems el = new ElectronicItems();
		el.setPrice(5000);
		el.setType("musicPlayers");
		
		
		ElectronicItems el2 = new ElectronicItems();
		el2.setPrice(6000);
		el2.setType("mirrors");
		
		
		ArrayList<ElectronicItems> al = new ArrayList<ElectronicItems>();
		al.add(el);
		al.add(el2);
		
		
		
		
		Car car = new Car();
		
		car.setMake("Mahindra");
		car.setModel("XUV500");
		car.setEngine(engine);
		car.setElectronics(al);
		
		
		given()
		.log()
		.all()
		.contentType(ContentType.JSON)
		.body(car)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log()
		.all();
	}
	

}
