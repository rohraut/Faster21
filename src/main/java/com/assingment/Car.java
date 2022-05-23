package com.assingment;

import java.util.List;

public class Car {
	
	 String make;
	 String model;
	 Engine engine;
	 List <ElectronicItems> electronics;
	
	
	
	
	public List<ElectronicItems> getElectronics() {
		return electronics;
	}
	public void setElectronics(List<ElectronicItems> electronics) {
		this.electronics = electronics;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
