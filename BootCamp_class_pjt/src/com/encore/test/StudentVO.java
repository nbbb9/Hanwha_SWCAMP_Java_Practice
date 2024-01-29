package com.encore.test;

public class StudentVO {
	
	private int age;
	
	private String name;//참조타입이면서 기본타입
	
	private double height;
	
	private boolean isMarriage;

	public StudentVO() {
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isMarriage() {
		return isMarriage;
	}

	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
	
	
}
