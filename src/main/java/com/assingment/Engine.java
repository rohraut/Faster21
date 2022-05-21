package com.assingment;
import static io.restassured.RestAssured.given;

public class Engine {

	private String power;
	
	 private int cc;
	 
	 
	 public static void main(String[] args) {
		 Engine engine = new Engine();
		
		 Car carObject = new Car();
		 carObject.setMake("Mahindra");
		 carObject.setModel("XUV500");
		 carObject.setEngine(engine);
		 
	}
}
