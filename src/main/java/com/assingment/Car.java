package com.assingment;
import static io.restassured.RestAssured.given;

public class Car {
	
	private String make;
	private String model;
	private String engine;
	
	public String getEngine() {
		return engine;
	}
	public String setEngine(String engine) {
		return this.engine = engine;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	

}
