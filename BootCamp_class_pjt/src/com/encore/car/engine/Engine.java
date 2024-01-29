package com.encore.car.engine;

public class Engine {
	
	private String engineType;
		
	public Engine() {
		
	}
	
	public Engine(String engineType) {
		this.engineType = engineType;
		System.out.println("");
	}
	
	public String showInfo() {
		return "엔진의 타입은 " + engineType+" 입니다.";
	}
	
}
